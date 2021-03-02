package com.pareandroid.haloumpar.Fakultas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.pareandroid.haloumpar.DosenTeknik.DosenElektro;
import com.pareandroid.haloumpar.DosenTeknik.DosenInformatika;
import com.pareandroid.haloumpar.DosenTeknik.DosenSipil;
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

    public void btn_teknik_sipil(View view){
      /*  Intent intent = new Intent(FakultasTeknik.this, DosenSipil.class);
        startActivity(intent);*/
        Toast.makeText(this,"Lagi Pengembangan Cess...",Toast.LENGTH_SHORT).show();
    }

    public void btn_teknik_elektro(View view){
       /* Intent intent = new Intent(FakultasTeknik.this, DosenElektro.class);
        startActivity(intent);*/
        Toast.makeText(this,"Lagi Pengembangan Cess...",Toast.LENGTH_SHORT).show();
    }
}
