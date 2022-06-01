package com.example.loginfirebasemail77;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginfirebasemail77.Adapter_farmacia;
import com.example.loginfirebasemail77.R;

import java.util.List;

import farmaciaapi.farmaciaapi2;
import models.Productos;
import models.farmaciarespuesta;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class farmacia_api extends AppCompatActivity {


    farmaciaapi.farmaciaapi2 farmaciaapi2;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmacia_api);

        farmaciaapi2 = Productos.getRetrofit().create(farmaciaapi.farmaciaapi2.class);
        recyclerView = findViewById(R.id.recyclerView);



        farmaciaapi2.getfarmacias().enqueue(new Callback<List<farmaciarespuesta>>() {
            @Override
            public void onResponse(Call<List<farmaciarespuesta>> call, Response<List<farmaciarespuesta>> response) {

                if (response.body().size()>0){
                    List<farmaciarespuesta> farmaciaList = response.body();
                    Adapter_farmacia adapter_farmacia = new Adapter_farmacia(farmacia_api.this, farmaciaList);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(farmacia_api.this);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(adapter_farmacia);

                    Toast.makeText(farmacia_api.this, "Llista carregada", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(farmacia_api.this, "Lista vacia", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<farmaciarespuesta>> call, Throwable t) {
                Toast.makeText(farmacia_api.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

            }
        });

    }



}