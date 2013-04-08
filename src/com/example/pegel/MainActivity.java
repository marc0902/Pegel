package com.example.pegel;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void tasteklick(View view){
		  goToUrl ( "http://www.pegelonline.wsv.de/webservices/rest-api/v2/stations/ccccb57f-a2f9-4183-ae88-5710d3afaefd/W/currentmeasurement.json"); 
		  
		 }
		 
		 
		 private void goToUrl (String url) {
		        Uri uriUrl = Uri.parse(url);
		        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
		        startActivity(launchBrowser);
		         }

}
