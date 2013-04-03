package vn.com.amdvietnam.rma;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
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
        
        final TextView uriRegister = (TextView) findViewById(R.id.uriRegister);
        uriRegister.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Open Register Activity
				
			}
		});
        
        //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        //startActivity(browserIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
