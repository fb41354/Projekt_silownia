package com.example.projekt_silownia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity_poziom_2 extends AppCompatActivity
{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poziom_2);
        ListView listDrinks = findViewById(R.id.listView_poziom2);
        ArrayAdapter<Cwiczenie> listAdapter = new ArrayAdapter<Cwiczenie>(this, android.R.layout.simple_list_item_1, Cwiczenie.cwiczenia_poziom_2);
        listDrinks.setAdapter(listAdapter);
        listDrinks.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(Activity_poziom_2.this, Activity_cwiczenie.class);
                intent.putExtra(Activity_cwiczenie.EXTRA_CWICZENIE_NR, (int)id);
                intent.putExtra(Activity_cwiczenie.EXTRA_POZIOM_NR, 2);
                startActivity(intent);
            }
        });




    }
}
