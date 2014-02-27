package com.example.saurav;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class News extends Activity {
	
	private WebView wv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news);
		
		wv = (WebView) findViewById(R.id.webView1);
		wv.setBackgroundColor(0x00000000);
		wv.loadUrl("http://saurav.webuda.com/server/android/news.php");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.news, menu);
		return true;
	}

}
