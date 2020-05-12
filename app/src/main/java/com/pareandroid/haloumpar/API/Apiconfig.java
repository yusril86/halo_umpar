package com.pareandroid.haloumpar.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiconfig {
    private static final String BASE_URL = "https://appdosenumpar.000webhostapp.com/";
    private static Retrofit retrofit ;


    public static Retrofit getApi(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
