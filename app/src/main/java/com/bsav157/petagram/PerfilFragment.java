package com.bsav157.petagram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    private View view;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_perfil, container, false);
        setPets();
        return view;
    }

    private void setPets(){
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Katty", 5, R.drawable.perro));
        pets.add(new Pet("Bonny", 0, R.drawable.perro));
        pets.add(new Pet("Miky", 4, R.drawable.perro));
        pets.add(new Pet("Doggie", 2, R.drawable.perro));
        pets.add(new Pet("Tommy", 10, R.drawable.perro));

        RecyclerView recycler = view.findViewById(R.id.recycler_perfil);
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 2);
        recycler.setLayoutManager(grid);
        PetAdapter adapter = new PetAdapter(pets, getActivity(), true);
        recycler.setAdapter(adapter);
    }
}