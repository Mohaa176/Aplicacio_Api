package farmaciaapi;

import java.util.List;

import models.productosrespuesta;
import retrofit2.Call;
import retrofit2.http.GET;

public interface farmaciaapiservice {

    @GET("producte")
    Call<List<productosrespuesta>> getproductos();
}
