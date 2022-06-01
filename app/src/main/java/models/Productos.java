package models;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Productos {
    private static Retrofit retrofit;
    private static final String BASEURL = "http://apisamu.somee.com/ApiPublicada/api/";

    public static Retrofit getRetrofit() {
        if (retrofit == null){
            retrofit = new Retrofit.Builder().
                    baseUrl(BASEURL).
                    addConverterFactory(GsonConverterFactory.create()).
                    build();

        }

        return retrofit;
    }
}
