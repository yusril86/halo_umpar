package com.pareandroid.haloumpar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class InfoDosenInformatika extends AppCompatActivity {
    String nama,nbm, no_hp;
    TextView tv_nama,tv_nbm,tv_nohp;
    ImageButton btn_wa,btn_copy,btn_telpon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_dosen_informatika);

        tv_nama= findViewById(R.id.tv_nama_dosen_informatika);
        tv_nbm = findViewById(R.id.tv_nbm_informatika);
        tv_nohp = findViewById(R.id.tv_nohp_informatika);
        btn_telpon = findViewById(R.id.btn_telp);
        btn_wa = findViewById(R.id.btn_wa);
        btn_copy = findViewById(R.id.btn_copy);

        nama = getIntent().getExtras().getString("nama");
        nbm = getIntent().getExtras().getString("nbm");
        no_hp = getIntent().getExtras().getString("nohp");

        tv_nama.setText(nama);
        tv_nohp.setText(no_hp);
        tv_nbm.setText(nbm);


        btn_telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_CALL);
                intentCall.setData(Uri.parse("tel:"+tv_nohp.getText()));


                if (ActivityCompat.checkSelfPermission(InfoDosenInformatika.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }

                    startActivity(intentCall);

            }
        });

        btn_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("nohp",tv_nohp.getText());
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(InfoDosenInformatika.this,"Telah dicopy...",Toast.LENGTH_SHORT).show();
            }
        });


        btn_wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:"+tv_nohp.getText());
                Intent intentWa = new Intent(Intent.ACTION_SENDTO,uri);
                intentWa.setPackage("com.whatsapp");
                startActivity(intentWa);
            }
        });

    }

}
