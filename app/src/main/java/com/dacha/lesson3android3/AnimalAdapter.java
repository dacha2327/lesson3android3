package com.dacha.lesson3android3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<String> arrayList;
    public AnimalAdapter(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_iv , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.bind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
