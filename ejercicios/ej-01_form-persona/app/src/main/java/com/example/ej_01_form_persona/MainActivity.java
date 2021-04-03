package com.example.ej_01_form_persona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener myListener = new MyListener(this);
        Button btnSave = super.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(myListener);
    }
}