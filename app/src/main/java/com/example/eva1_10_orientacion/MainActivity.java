package com.example.eva1_10_orientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvwmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtvwmsg = findViewById(R.id.txtvwmsg);
        txtvwmsg.setText("El mismo widget pero de ladito");
    }
}