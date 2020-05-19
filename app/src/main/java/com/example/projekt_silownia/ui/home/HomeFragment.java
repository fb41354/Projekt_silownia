package com.example.projekt_silownia.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.projekt_silownia.Activity_poczatkujacy;
import com.example.projekt_silownia.Activity_cwiczacy;
import com.example.projekt_silownia.Activity_zaawansowany;
import com.example.projekt_silownia.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Button button_poczatkujacy;
    private Button button_cwiczacy;
    private Button button_zaawansowany;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //poczatkujacy activity
        Button button_poczatkujacy = (Button) view.findViewById(R.id.button_poczatkuajcy);
        button_poczatkujacy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                openActivity_poczatkujacy();
            }
        });
        //cwiczacy acitvity
        Button button_cwiczacy = (Button) view.findViewById(R.id.button_cwiczacy);
        button_cwiczacy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                openActivity_cwiczacy();
            }
        });
        //zaawansowany activity
        Button button_zaawansowany = (Button) view.findViewById(R.id.button_zaawansowany);
        button_zaawansowany.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // do something
                openActivity_zaawansowany();
            }
        });




        return view;
    }
    public void openActivity_poczatkujacy()
    {
        Intent intent = new Intent(getActivity(), Activity_poczatkujacy.class);
        startActivity(intent);
    }
    public void openActivity_cwiczacy()
    {
        Intent intent = new Intent(getActivity(), Activity_cwiczacy.class);
        startActivity(intent);
    }
    public void openActivity_zaawansowany()
    {
        Intent intent = new Intent(getActivity(), Activity_zaawansowany.class);
        startActivity(intent);
    }




}
