package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSaludar = super.findViewById(R.id.btnSaludor);
        btnSaludar.setText("Saludo desde java");

        Button btnReset = super.findViewById(R.id.btnReset);

        View.OnClickListener myListener = new MyListener(this);
        btnSaludar.setOnClickListener(myListener);
        btnReset.setOnClickListener(myListener);
    }
}