package com.example.form_persona_mvc;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PersonaView {
    private PersonaController personaController;
    private Button btnGuardar;
    private RadioGroup rgSexo;
    private EditText eTDni;
    private EditText eTApellido;
    private EditText eTName;
    private PersonaModel personaModel;
    private Activity activity;

    public PersonaView(Activity activity, PersonaModel personaModel, PersonaController personaController){
        this.activity = activity;
        this.personaModel = personaModel;
        this.personaController = personaController;
        this.eTName  = this.activity.findViewById(R.id.eTName);
        this.eTApellido = this.activity.findViewById(R.id.eTSurname);
        this.eTDni = this.activity.findViewById(R.id.eTDni);
        this.rgSexo = this.activity.findViewById(R.id.rgSexo);
        this.btnGuardar = this.activity.findViewById(R.id.btnSave);
        this.btnGuardar.setOnClickListener(personaController);
    }

    public void guardarModelo(){
        int radioId = this.rgSexo.getCheckedRadioButtonId();
        RadioButton rbSexo = this.activity.findViewById(radioId);
        this.personaModel.setNombre(this.eTName.getText().toString());
        this.personaModel.setApellido(this.eTApellido.getText().toString());
        this.personaModel.setDni(Integer.parseInt(this.eTDni.getText().toString()));
        this.personaModel.setSexo(rbSexo.getText().toString());
    }

    public void mostrarModelo(){
        this.eTName.setText(this.personaModel.getNombre().toString());
        this.eTApellido.setText(this.personaModel.getApellido());
        //this.eTDni.setText(this.personaModel.getDni().intValue());
        RadioButton b;
        if ("Mujer".equals(this.personaModel.getSexo())){
            b = (RadioButton) this.activity.findViewById(R.id.radioMujer);
        } else {
            b = (RadioButton) this.activity.findViewById(R.id.radioHombre);
        }
        b.setChecked(true);
    }
}
