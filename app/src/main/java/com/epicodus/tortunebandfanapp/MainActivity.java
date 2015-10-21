package com.epicodus.tortunebandfanapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bandName = (TextView) findViewById(R.id.bandName);
        Typeface fontSparkly = Typeface.createFromAsset(getAssets(), "fonts/sparkly.ttf");
        bandName.setTypeface(fontSparkly);
    }

}
