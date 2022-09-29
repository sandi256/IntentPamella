package com.example.intentpamella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Button;
    EditText hargabarang, jumlahbarang,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button = (Button) findViewById(R.id.Button);
       hargabarang = (EditText) findViewById(R.id.hargabarang);
       jumlahbarang = (EditText) findViewById(R.id.jumlahbarang);
       hasil = (EditText) findViewById(R.id.hasil);



        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new  Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                if ((hargabarang.getText().length() > 0) && (jumlahbarang.getText().length() > 0))
                {
                    double Harga = Double.parseDouble(hargabarang.getText().toString());
                    double Jumlah = Double.parseDouble(jumlahbarang.getText().toString());
                    double result = Harga * Jumlah;
                    hasil.setText(Double.toString(result));

                }

                else {
                    Toast.makeText(MainActivity.this, "Masukan Data Dengan Lengkap", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

