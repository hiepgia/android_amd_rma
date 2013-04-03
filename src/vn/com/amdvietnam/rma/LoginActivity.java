package vn.com.amdvietnam.rma;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		//Start Login Processing
		final Button btnLogin = (Button) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	AlertDialog alertDialog;
            	alertDialog = new AlertDialog.Builder(LoginActivity.this).create();
            	alertDialog.setTitle("Button Event");
            	alertDialog.setMessage("Button clicked.");
            	alertDialog.show();
            }
        });
		//End Login Processing
		
		
		//Start switch to register activity
        final TextView uriRegister = (TextView) findViewById(R.id.uriRegister);
        uriRegister.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Open Register Activity
				
			}
		});
        //End Switch to register activity
        
        //Start Open Link AMDVietNam
        final TextView uriAMDVietNam = (TextView) findViewById(R.id.linkAMDVietNam);
        uriAMDVietNam.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://amdvietnam.com.vn"));
		        startActivity(browserIntent);	
			}
		});
        //End Open Link AMDVietNam
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
