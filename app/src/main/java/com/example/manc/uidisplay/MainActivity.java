package com.example.manc.uidisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay;


    public void btnShow (View view) {

        txtDisplay.setVisibility(View.VISIBLE);

    }

    public void btnHide (View view) {
        txtDisplay.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDisplay = (TextView) findViewById(R.id.txtDisplay);

    }
}
