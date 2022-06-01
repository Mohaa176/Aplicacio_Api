package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import farmaciaapi.farmaciaapiservice;

import models.Productos;
import models.productosrespuesta;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class productes_api extends AppCompatActivity {


    farmaciaapiservice farmaciaapiservice;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productes_api);

        farmaciaapiservice = Productos.getRetrofit().create(farmaciaapi.farmaciaapiservice.class);
        recyclerView = findViewById(R.id.recyclerView);



        farmaciaapiservice.getproductos().enqueue(new Callback<List<productosrespuesta>>() {
            @Override
            public void onResponse(Call<List<productosrespuesta>> call, Response<List<productosrespuesta>> response) {

                if (response.body().size()>0){
                    List<productosrespuesta> productosList = response.body();
                    Adapter debo = new Adapter(productes_api.this, productosList);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(productes_api.this);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(debo);

                    Toast.makeText(productes_api.this, "Lista no vacia", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(productes_api.this, "Lista vacia", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<productosrespuesta>> call, Throwable t) {
                Toast.makeText(productes_api.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

            }
        });

    }



}