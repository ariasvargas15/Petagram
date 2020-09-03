package com.bsav157.petagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder>{

    private ArrayList<Pet> pets;
    private Context context;

    public PetAdapter(ArrayList<Pet> pets, Context context) {
        this.pets = pets;
        this.context = context;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PetViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pet, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final PetViewHolder holder, int position) {
        final Pet pet = pets.get(position);
        holder.name.setText(pet.getName());
        holder.number.setText(String.valueOf(pet.getLikes()));
        holder.image.setImageResource(pet.getImage());

        holder.like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You liked " + pet.getName(), Snackbar.LENGTH_SHORT).show();
                pet.setLikes(pet.getLikes() + 1);
                holder.number.setText(String.valueOf(pet.getLikes()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    class PetViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        ImageView like;
        TextView name;
        TextView number;
        public PetViewHolder(View iteView){
            super(iteView);
            like = iteView.findViewById(R.id.like);
            number = iteView.findViewById(R.id.number);
            name = iteView.findViewById(R.id.name);
            image = iteView.findViewById(R.id.image);
        }
    }
}
