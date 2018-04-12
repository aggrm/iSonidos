package com.example.xp.isonidos;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SoundPool sonidos;
    int sonido1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonidos = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        sonido1 = sonidos.load(this, R.raw.ramonpitis_orejudo,1);
    }

    public void sonido(View vista)
    {
//        MediaPlayer mp = MediaPlayer.create(this, R.raw.chiquito_quietorl);
//        mp.start();
        sonidos.play(sonido1,1, 1, 1, 0,1);
    }
}
