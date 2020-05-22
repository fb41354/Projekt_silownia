package com.example.projekt_silownia;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_cwiczenie extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cwiczenie);


        runTimer();
    }


    public void cwiczenie_slide(View view)
    {
        Intent intent = new Intent(this, Activity_cwiczenie_slide.class);
        startActivity(intent);
    }

    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning",wasRunning );
    }
    // Metoda uruchamia stoper po kliknieciu przycisku Start
    public void onClickStart(View view)
    {
        running = true;
    }

    //Metoda zatrzymuje stoper po kliknieciu przyciksu Stop
    public void onClickStop(View view)
    {
        running = false;
    }

    //Metoda zeruje stoper po kliknieciu przycisku Kasuj
    public void onClickReset(View view)
    {
        running = false;
        seconds = 0;
    }

    protected void onStop()
    {
        super.onStop();
        wasRunning = running;
        running = false;
    }

    protected  void onStart()
    {
        super.onStart();
        if(wasRunning)
        {
            running = true;
        }
    }

    private void runTimer()
    {
        final TextView timeView = (TextView)findViewById(R.id.time_view);

        //...
        final Handler handler = new Handler();

        handler.post(new Runnable()
        {
            @Override
            public void run()
            {

                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running)
                {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }


}