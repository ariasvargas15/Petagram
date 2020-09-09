package com.bsav157.petagram;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PetListFragment extends Fragment {

    private View view;

    public PetListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pet_list, container, false);
        setPets();
        return view;
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

        RecyclerView recycler = view.findViewById(R.id.recycler_main);
        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        linear.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(linear);
        PetAdapter adapter = new PetAdapter(pets, getActivity());
        recycler.setAdapter(adapter);
    }
}