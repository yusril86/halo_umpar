package com.pareandroid.haloumpar;

import com.pareandroid.haloumpar.API.ApiResponse;
import com.pareandroid.haloumpar.API.Apiconfig;
import com.pareandroid.haloumpar.Model.ModelTeknik;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InformatikaPresenter {
    private InformatikaView iView;

    public InformatikaPresenter(InformatikaView view){
        this.iView = view;
    }

    public void Tampildoseninformatika() {
        iView.Showloading();

        ApiResponse apiResponse = Apiconfig.getApi().create(ApiResponse.class);
        Call<List<ModelTeknik>> teknikCall = apiResponse.getInformatia();
        teknikCall.enqueue(new Callback<List<ModelTeknik>>() {
            @Override
            public void onResponse(Call<List<ModelTeknik>> call, Response<List<ModelTeknik>> response) {
                iView.Hideloading();
                iView.Onresponse(response.body());
            }

            @Override
            public void onFailure(Call<List<ModelTeknik>> call, Throwable t) {
                iView.Hideloading();
                iView.Onfailure(t.getLocalizedMessage());
            }
        });
    }

}
