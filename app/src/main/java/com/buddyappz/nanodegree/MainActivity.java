package com.buddyappz.nanodegree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        switch (v.getId()) {
            case R.id.buttonSpotify: {
                Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer!", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonScores: {
                Toast.makeText(getApplicationContext(), "This button will launch Football Scores App!", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonLibrary: {
                Toast.makeText(getApplicationContext(), "This button will launch Library App!", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonBigger: {
                Toast.makeText(getApplicationContext(), "This button will show how to build it bigger!", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonXyz: {
                Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader!", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonMyApp: {
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
