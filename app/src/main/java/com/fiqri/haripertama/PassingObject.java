package com.fiqri.haripertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PassingObject extends AppCompatActivity {

    //TODO 2.7 deklarasi variable penampung dari object
    public static final String EXTRA_OBJECT = "OBJECT";
    TextView tvObjectReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_object);

        // casting view / hubungkan dengan id nya
        tvObjectReceived = findViewById(R.id.tv_data_object);
    }
}
