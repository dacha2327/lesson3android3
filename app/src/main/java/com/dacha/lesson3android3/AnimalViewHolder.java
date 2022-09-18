package com.dacha.lesson3android3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView rv_tv3;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        rv_tv3 = itemView.findViewById(R.id.rv_tv3);
    }
    public void bind(String animal){rv_tv3.setText(animal);}
}
