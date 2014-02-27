package com.example.saurav;


import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;


public class LocationActivity extends Activity implements LocationListener {
  private TextView latituteField;
  private TextView longitudeField;
  private LocationManager locationManager;
  private String provider;
  
  private WebView wv;
  
/** Called when the activity is first created. */

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_location);
    latituteField = (TextView) findViewById(R.id.TextView02);
    longitudeField = (TextView) findViewById(R.id.TextView04);
    
    wv = (WebView) findViewById(R.id.webView1);
    wv.setBackgroundColor(0x00000000);
 

    locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

    Criteria criteria = new Criteria();
    provider = locationManager.getBestProvider(criteria, false);
    Location location = locationManager.getLastKnownLocation(provider);


    if (location != null) {
      System.out.println("Provider " + provider + " has been selected.");
      
      onLocationChanged(location);
      
    } else {
      latituteField.setText("Location not available");
      longitudeField.setText("Location not available");
      wv.loadData("Internet Unavailable","text/html; charset=UTF-8", null);
      
    }
  }

  /* Request updates at startup */
  @Override
  protected void onResume() {
    super.onResume();
    locationManager.requestLocationUpdates(provider, 400, 1, this);
    
  }

  /* Remove the locationlistener updates when Activity is paused */
  @Override
  protected void onPause() {
    super.onPause();
    locationManager.removeUpdates(this);
  }

  @Override
  public void onLocationChanged(Location location) {
    float lat = (float) (location.getLatitude());
    float lng = (float) (location.getLongitude());
    latituteField.setText(String.valueOf(lat));
    longitudeField.setText(String.valueOf(lng));
    
    String url; 
	url = "http://saurav.webuda.com/server/android/location.php?lg="+String.valueOf(lng)+"&lt="+String.valueOf(lat);
	wv.loadUrl(url);
	
    
  }

  @Override
  public void onStatusChanged(String provider, int status, Bundle extras) {
    // TODO Auto-generated method stub

  }

  @Override
  public void onProviderEnabled(String provider) {
    Toast.makeText(this, "Enabled new provider " + provider,
        Toast.LENGTH_SHORT).show();

  }

  @Override
  public void onProviderDisabled(String provider) {
    Toast.makeText(this, "Disabled provider " + provider,
        Toast.LENGTH_SHORT).show();
  }

	

	
  
} 