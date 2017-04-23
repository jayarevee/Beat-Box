package com.example.jayare.beatbox;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;
    AudioManager audioManager;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void playSound(View view){
        //int tag = Integer.parseInt(view.getTag().toString());
        int id = view.getId();

        String theId = "";

        theId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(theId, "raw","com.example.jayare.beatbox");

        mPlayer = MediaPlayer.create(this,resourceId);
        mPlayer.start();

        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            };
        });
        /*switch(tag){
            case 1:
                mPlayer = MediaPlayer.create(this,R.raw.crash);
            case 2:
                mPlayer = MediaPlayer.create(this,R.raw.clap);
            case 3:
                mPlayer = MediaPlayer.create(this,R.raw.hihat);
            case 4:
                mPlayer = MediaPlayer.create(this,R.raw.hihat2);
            case 5:
                mPlayer = MediaPlayer.create(this,R.raw.kick1);
            case 6:
                mPlayer = MediaPlayer.create(this,R.raw.kick2);
            case 7:
                mPlayer = MediaPlayer.create(this,R.raw.snaredrum);
            case 8:
                mPlayer = MediaPlayer.create(this,R.raw.hithat3);
            default:
                mPlayer = MediaPlayer.create(this,R.raw.hithat3);

        }
*/


    }
}
