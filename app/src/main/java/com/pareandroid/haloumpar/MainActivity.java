package com.pareandroid.haloumpar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pareandroid.haloumpar.Fakultas.FakultasTeknik;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn_teknik (View view){
        Intent intent = new Intent(MainActivity.this, FakultasTeknik.class);
        startActivity(intent);
    }
}
