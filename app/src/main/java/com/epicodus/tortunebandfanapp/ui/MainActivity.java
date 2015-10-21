package com.epicodus.tortunebandfanapp.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.epicodus.tortunebandfanapp.R;

public class MainActivity extends AppCompatActivity {

    private Button mMembersButton;
    private Button mAlbumButton;
    private Button mTourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView bandName = (TextView) findViewById(R.id.bandName);
        Typeface fontSparkly = Typeface.createFromAsset(getAssets(), "fonts/sparkly.ttf");
        bandName.setTypeface(fontSparkly);

        mMembersButton = (Button) findViewById(R.id.membersButton);
        mAlbumButton = (Button) findViewById(R.id.albumButton);
        mTourButton = (Button) findViewById(R.id.tourButton);

        mMembersButton.setTypeface(fontSparkly);
        mAlbumButton.setTypeface(fontSparkly);
        mTourButton.setTypeface(fontSparkly);

        mMembersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_in);
            }
        });

        mAlbumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.abc_slide_in_top, R.anim.abc_slide_in_top);
            }
        });

        mTourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TourActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_in_bottom);
            }
        });

    }

}
