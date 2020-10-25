package com.desarrollo.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> Listpersonas;

    private void inicializarDatos(){
        Listpersonas = new ArrayList<>();

        Listpersonas.add(new Persona("Tortuninjas","25 años de edad",R.drawable.tor1));
        Listpersonas.add(new Persona("Naruto","26 años de edad",R.drawable.tor2));
        Listpersonas.add(new Persona("One Piece","27 años de edad",R.drawable.tor3));

        Listpersonas.add(new Persona("New Serie","28 años de edad",R.drawable.tor4));
        Listpersonas.add(new Persona("Jorge El Curioso","29 años de edad",R.drawable.tor5));
        Listpersonas.add(new Persona("Doraemon","30 años de edad",R.drawable.tor6));
        Listpersonas.add(new Persona("Vaca y el pollito","31 años de edad",R.drawable.tor7));
        Listpersonas.add(new Persona("Scooby Doo","32 años de edad",R.drawable.tor8));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(linearLayoutManager);

        inicializarDatos();

        RVAdapter rvAdapter = new RVAdapter(Listpersonas,getApplicationContext());
        recyclerView.setAdapter(rvAdapter);
    }
}

