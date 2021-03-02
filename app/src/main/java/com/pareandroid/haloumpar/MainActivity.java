package com.pareandroid.haloumpar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    public void btn_ekonomi (View view){
        Toast.makeText(this, "Lagi Pengembangan...", Toast.LENGTH_SHORT).show();;
    }

    public void btn_hukum (View view){
        Toast.makeText(this, "Lagi Pengembangan...", Toast.LENGTH_SHORT).show();;
    }

    public void btn_pertanian(View view){
        Toast.makeText(this, "Lagi Pengembangan...", Toast.LENGTH_SHORT).show();;
    }
}
