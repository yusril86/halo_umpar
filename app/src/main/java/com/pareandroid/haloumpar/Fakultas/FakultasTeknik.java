package com.pareandroid.haloumpar.Fakultas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pareandroid.haloumpar.Dosen.DosenInformatika;
import com.pareandroid.haloumpar.R;

public class FakultasTeknik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakultas_teknik);


    }
    public void btn_teknik_informatika(View view){
        Intent intent = new Intent(FakultasTeknik.this, DosenInformatika.class);
        startActivity(intent);
    }
}
