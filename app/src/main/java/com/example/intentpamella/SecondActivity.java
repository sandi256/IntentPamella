package com.example.intentpamella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    EditText namabarang, hargabarang, jumlahbarang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        namabarang = findViewById(R.id.namabarang);
        jumlahbarang = findViewById(R.id.jumlahbarang);
        hargabarang = findViewById(R.id.jumlahbarang);
    }
}