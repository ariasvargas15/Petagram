package com.bsav157.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        findViewById(R.id.space).setVisibility(View.GONE);
        findViewById(R.id.fav).setVisibility(View.INVISIBLE);
        setPets();
    }

    private void setPets(){
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Katty", 5, R.drawable.perro));
        pets.add(new Pet("Bonny", 0, R.drawable.perro));
        pets.add(new Pet("Miky", 4, R.drawable.perro));
        pets.add(new Pet("Doggie", 2, R.drawable.perro));
        pets.add(new Pet("Tommy", 10, R.drawable.perro));

        RecyclerView recycler = findViewById(R.id.recycler_favorite);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        linear.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linear);
        PetAdapter adapter = new PetAdapter(pets, this);
        recycler.setAdapter(adapter);
    }
}