package com.example.projekt_silownia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity_poziom_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poziom_3);
        ListView listDrinks = findViewById(R.id.listView_poziom3);
        ArrayAdapter<Cwiczenie> listAdapter = new ArrayAdapter<Cwiczenie>(
                this, android.R.layout.simple_list_item_1, Cwiczenie.cwiczenia_poziom_3
        );
        listDrinks.setAdapter(listAdapter);
        listDrinks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(Activity_poziom_3.this, Activity_cwiczenie.class);
                intent.putExtra(Activity_cwiczenie.EXTRA_CWICZENIE_NR, (int)id);
                intent.putExtra(Activity_cwiczenie.EXTRA_POZIOM_NR, 3);
                startActivity(intent);
            }
        });
    }
}
