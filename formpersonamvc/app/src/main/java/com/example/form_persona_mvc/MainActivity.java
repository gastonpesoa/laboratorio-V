package com.example.form_persona_mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonaModel personaModel = new PersonaModel();
        PersonaController personaController = new PersonaController(personaModel);
        PersonaView personaView = new PersonaView(this, personaModel , personaController);
        personaController.setPersonaView(personaView);
    }
}