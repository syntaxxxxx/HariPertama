package com.fiqri.haripertama;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PassingData extends AppCompatActivity {

    //TODO 2.2 variable penampung data yang akan diterima / key
    public static final String EXTRA_NAME = "NAME";
    public static final String EXTRA_AGE = "AGE";

    //TODO 2.3 deklarasi variable textview
    TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data);

        //TODO 2.4 casting view / hubungkan dengan id nya
        tvDataReceived = findViewById(R.id.tv_data_received);

        //TODO 2.6 get data nya sesuai dgn type data
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        // tampung dalam variable
        String nampilin = "Name : " + name
                + "\nAge : " + age;

        // show ke text
        tvDataReceived.setText(nampilin);
    }
}
