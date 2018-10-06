package com.fiqri.haripertama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.fiqri.haripertama.PassingData.EXTRA_NAME;


public class MainActivity extends AppCompatActivity {

    //TODO 1.1 deklarasi variable dari sebuah button secara global
    Button btnMove, btnPassData, btnPassObject, btnDial, btnEmail, btnCallBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1.2 casting view / hubungkan dengan id
        btnMove = findViewById(R.id.btn_move);
        btnPassData = findViewById(R.id.btn_pass_data);
        btnPassObject = findViewById(R.id.btn_pass_object);
        btnDial = findViewById(R.id.btn_dial_number);
        btnEmail = findViewById(R.id.btn_email_client);
        btnCallBack = findViewById(R.id.btn_call_back);

        //TODO 1.3 event click dari sebuah button / melakukan sebuah aksi
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // param 1 activity asal, param 2 activity tujuan
                Intent move = new Intent(MainActivity.this, Move.class);
                startActivity(move);
            }
        });

        //TODO 2.1
        btnPassData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent passData = new Intent(MainActivity.this, PassingData.class);
                //TODO 2.5 kirim data sesuai dengan type data
                passData.putExtra(EXTRA_NAME, "Fiqri Hafzain Islami");
                passData.putExtra(PassingData.EXTRA_AGE, 20);
                startActivity(passData);
            }
        });
    }
}
