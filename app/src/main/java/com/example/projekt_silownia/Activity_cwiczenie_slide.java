package com.example.projekt_silownia;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_cwiczenie_slide extends AppCompatActivity {

    public static final String EXTRA_CWICZENIE_NR = "cwiczenieNR";
    public static final String EXTRA_POZIOM_NR = "poziomNR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cwiczenie_slide);

        Cwiczenie cw = null;

        int cwiczenieNR = (Integer)getIntent().getExtras().get(EXTRA_CWICZENIE_NR);
        int poziomNR = (Integer)getIntent().getExtras().get(EXTRA_POZIOM_NR);

        if(poziomNR == 1)
            cw = Cwiczenie.cwiczenia_poziom_1[cwiczenieNR];
        else if(poziomNR == 2)
            cw = Cwiczenie.cwiczenia_poziom_2[cwiczenieNR];
        else if(poziomNR == 3)
            cw = Cwiczenie.cwiczenia_poziom_3[cwiczenieNR];


        //Wyswietlamy opis napoju
        TextView description = findViewById(R.id.opis_cw);
        description.setText(cw.getOpis());


        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + cw.getFilm_id();
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }


}