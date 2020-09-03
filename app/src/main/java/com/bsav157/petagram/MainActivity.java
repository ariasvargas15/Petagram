package com.bsav157.petagram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = findViewById(R.id.fav);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplication(), FavoriteActivity.class);
                startActivity(in);
            }
        });
        setPets();
    }

    private void setPets(){
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Katty", 5, R.drawable.perro));
        pets.add(new Pet("Bonny", 0, R.drawable.perro));
        pets.add(new Pet("Ronny", 1, R.drawable.perro));
        pets.add(new Pet("Lucas", 3, R.drawable.perro));
        pets.add(new Pet("Miky", 4, R.drawable.perro));
        pets.add(new Pet("Sasha", 0, R.drawable.perro));
        pets.add(new Pet("Doggie", 2, R.drawable.perro));
        pets.add(new Pet("Dakota", 2, R.drawable.perro));
        pets.add(new Pet("Tommy", 10, R.drawable.perro));

        RecyclerView recycler = findViewById(R.id.recycler_main);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        linear.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linear);
        PetAdapter adapter = new PetAdapter(pets, this);
        recycler.setAdapter(adapter);
    }
}