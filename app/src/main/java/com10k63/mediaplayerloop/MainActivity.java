package com10k63.mediaplayerloop;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Switch mLoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.clap);
        mLoop = (Switch) findViewById(R.id.switchLoop);
        mLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mp.setLooping(isChecked);
            }
        });


    }
    public void playSound (View view) {
        mp.start();
    }

    public void pauseSound (View view) {
        if (mp.isPlaying())
            mp.pause();
    }
}
