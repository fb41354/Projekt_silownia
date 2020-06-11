package com.example.projekt_silownia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity_poziom_1 extends AppCompatActivity
{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poziom_1);
        ListView listDrinks = findViewById(R.id.listView_poziom1);
        ArrayAdapter<Cwiczenie> listAdapter = new ArrayAdapter<Cwiczenie>(this, android.R.layout.simple_list_item_1, Cwiczenie.cwiczenia_poziom_1);
        listDrinks.setAdapter(listAdapter);
        listDrinks.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(Activity_poziom_1.this, Activity_cwiczenie.class);
                intent.putExtra(Activity_cwiczenie.EXTRA_CWICZENIE_NR, (int)id);
                intent.putExtra(Activity_cwiczenie.EXTRA_POZIOM_NR, 1);
                startActivity(intent);
            }
        });
        listView=findViewById(R.id.listView_poziom1);

        String[] itemList=new String[]{
                "Kolana do klatki",
                "Opuszczanie na drazku",
                "Podciaganie Mlotkowe",
                "Pompka na poreczach",
                "Ugiete nogi do klatki",
                "Dipy",};

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itemList)
        {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
            {
                View view= super.getView(position,convertView,parent);
                if(position%2==1)
                {
                    view.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                }
                else
                {
                    view.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
                }
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);
    }
}
