package com.example.loginfirebasemail77;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import models.productosrespuesta;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.Date;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CustomViewHolder> {
    private List<productosrespuesta> datalist;
    private Context context;

    public Adapter(Context context,List<productosrespuesta> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public Adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_productes, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.CustomViewHolder holder, int position) {
        //holder.ids.setText(datalist.get(position).getId());
        holder.nombres.setText(datalist.get(position).getName());
        holder.descripcion.setText(datalist.get(position).getDescripcio());
        holder.fecha.setText(datalist.get(position).getData());
        holder.representant.setText(datalist.get(position).getRepresentant());
        holder.stock.setText(datalist.get(position).getStock());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

         TextView descripcion, nombres, fecha,representant,stock;
         ImageView imagen;

         CustomViewHolder(@NonNull View itemView) {
            super(itemView);

             descripcion = itemView.findViewById(R.id.descripcion);
             nombres = itemView.findViewById(R.id.nombres);
             fecha = itemView.findViewById(R.id.fecha);
             representant = itemView.findViewById(R.id.representant);
             stock = itemView.findViewById(R.id.stock);

        }
    }
}
