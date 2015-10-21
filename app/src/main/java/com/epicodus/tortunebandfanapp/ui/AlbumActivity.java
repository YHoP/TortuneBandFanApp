package com.epicodus.tortunebandfanapp.ui;

import android.media.MediaPlayer;
import android.app.Service;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.tortunebandfanapp.R;


public class AlbumActivity extends AppCompatActivity {

//    MediaPlayer player;

    private Button mPlayButton, mStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        /*
        mPlayButton = (Button) findViewById(R.id.playButton);
        mStopButton = (Button) findViewById(R.id.stopButton);

        player = MediaPlayer.create(AlbumActivity.this, R.raw.tortune_don_delillo);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });
        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });
        */
    }
}
