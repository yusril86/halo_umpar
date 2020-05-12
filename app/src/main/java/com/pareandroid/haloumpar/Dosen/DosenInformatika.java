package com.pareandroid.haloumpar.Dosen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.pareandroid.haloumpar.API.ApiResponse;
import com.pareandroid.haloumpar.API.Apiconfig;
import com.pareandroid.haloumpar.Adapter.AdapterInformatika;
import com.pareandroid.haloumpar.InformatikaPresenter;
import com.pareandroid.haloumpar.InformatikaView;
import com.pareandroid.haloumpar.Model.ModelTeknik;
import com.pareandroid.haloumpar.R;

import java.util.List;

public class DosenInformatika extends AppCompatActivity implements InformatikaView {
    ProgressBar progressBar;
    ApiResponse apiResponse;
    InformatikaPresenter informatikaPresenter;
    RecyclerView rv_listinformatika;
    private RecyclerView.Adapter Radpterinformatika;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen_informatika);

        progressBar = findViewById(R.id.pg_informatika);
        rv_listinformatika = findViewById(R.id.rv_informatika);

        apiResponse  = Apiconfig.getApi().create(ApiResponse.class);


        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        rv_listinformatika.setHasFixedSize(true);
        rv_listinformatika.setLayoutManager(linearLayoutManager);
        informatikaPresenter = new InformatikaPresenter(this);
        informatikaPresenter.Tampildoseninformatika();

    }


    @Override
    public void Showloading() {
    progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void Hideloading() {
        progressBar.setVisibility(View.GONE);
        rv_listinformatika.setVisibility(View.VISIBLE);
    }

    @Override
    public void Onresponse(List<ModelTeknik> modelTeknikList) {
        Radpterinformatika = new AdapterInformatika(modelTeknikList);
        rv_listinformatika.setAdapter(Radpterinformatika);
    }

    @Override
    public void Onfailure(String localizedMessage) {
        Toast.makeText(this,"Error...",Toast.LENGTH_SHORT).show();
    }
}
