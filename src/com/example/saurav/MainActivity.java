package com.example.saurav;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	Button b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //final Context context = this;
    	
    	b2 = (Button) findViewById(R.id.button2);
    	b3 = (Button) findViewById(R.id.button3);
    	b4 = (Button) findViewById(R.id.button4);
    	
    	
    	
    	b2.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View v)
    		{
    			Intent intent2 = new Intent (MainActivity.this,LocationActivity.class);
    			startActivity(intent2);
    		}
    		
    	});
    	b3.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View v)
    		{
    			Intent intent3 = new Intent (MainActivity.this,News.class);
    			startActivity(intent3);
    		}
    		
    	});
    	
    	b4.setOnClickListener(new OnClickListener()
    	{
    		public void onClick(View v)
    		{
    			Intent intent4 = new Intent (MainActivity.this,Quotes.class);
    			startActivity(intent4);
    		}
    		
    	});
    }
    
    
    	
    	
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
