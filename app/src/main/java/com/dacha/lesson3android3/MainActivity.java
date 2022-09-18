package com.dacha.lesson3android3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<String>animalList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_animal);
        animalList.add("Тигр");
        animalList.add("Кот");
        animalList.add("Лев");
        animalList.add("Гиена");
        animalList.add("Жаба");
        animalList.add("Заяц");
        animalList.add("Волк");
        animalList.add("Медведь");
        animalList.add("Лиса");
        animalList.add("Черепаха");
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(animalAdapter);
    }
}