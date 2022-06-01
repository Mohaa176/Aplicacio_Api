package farmaciaapi;

import java.util.List;

import models.farmaciarespuesta;
import retrofit2.Call;
import retrofit2.http.GET;

public interface farmaciaapi2 {

    @GET("farmacia")
    Call<List<farmaciarespuesta>> getfarmacias();
}
