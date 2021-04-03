package com.example.ej_01_form_persona;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MyListener implements View.OnClickListener {

    private Activity activity;
    private EditText etName = null;
    private EditText etSurname = null;
    private EditText etDNI = null;
    private RadioGroup rgSexo = null;
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public MyListener(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        if (this.etName == null){
            this.etName = this.activity.findViewById(R.id.eTName);
        }
        if (this.etSurname == null){
            this.etSurname = this.activity.findViewById(R.id.eTSurname);
        }
        if (this.etDNI == null){
            this.etDNI = this.activity.findViewById(R.id.eTDni);
        }
        if (this.rgSexo == null){
            this.rgSexo = this.activity.findViewById(R.id.rgSexo);
        }

        int radioId = this.rgSexo.getCheckedRadioButtonId();
        RadioButton rbSexo = this.activity.findViewById(radioId);

        String name = this.etName.getText().toString();
        String surname = this.etSurname.getText().toString();
        int dni = Integer.parseInt(this.etDNI.getText().toString());
        String sexo = rbSexo.getText().toString();

        this.persona = new Persona(name, surname, dni, sexo);

        Log.d("Saved person", this.persona.toString());
    }
}
