package com.pareandroid.haloumpar.API;

import com.pareandroid.haloumpar.Model.ModelTeknik;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiResponse {

    @GET ("informatika.php")
    Call<List<ModelTeknik>> getInformatia();


}
