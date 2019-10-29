package com.example.kuisdaftarkeluarga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData()
    {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.fat),"Dadang Widyanto","Ayah","Malang "));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.mom),"Sri Lestari","Ibu","Malang"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.son),"Ridho Yuli Firmansah","Anak Pertama","Malang"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.cat),"Mauludia Dwinta Putri","Anak Kedua","Pasuruan"));

    }
}
