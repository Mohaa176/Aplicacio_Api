package com.example.loginfirebasemail77;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import models.farmaciarespuesta;

public class Adapter_farmacia extends RecyclerView.Adapter<Adapter_farmacia.CustomViewHolder> {
    private List<farmaciarespuesta> datalist;
    private Context context;

    public Adapter_farmacia(Context context, List<farmaciarespuesta> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public Adapter_farmacia.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_farmacia, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_farmacia.CustomViewHolder holder, int position) {
        //holder.ids.setText(datalist.get(position).getId());
        holder.nom.setText(datalist.get(position).getNom());
        holder.carrer.setText(datalist.get(position).getCarrer());
        holder.telefon.setText(datalist.get(position).getTelefon());


    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView nom, carrer, telefon;
        ImageView imagen;

        CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            nom = itemView.findViewById(R.id.nom);
            carrer = itemView.findViewById(R.id.carrer);
            telefon = itemView.findViewById(R.id.telefon);


        }
    }
}
