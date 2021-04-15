package com.example.form_persona_mvc;

import android.util.Log;
import android.view.View;

public class PersonaController  implements View.OnClickListener {

    private PersonaModel personaModel;
    private PersonaView personaView;

    public PersonaController(PersonaModel personaModel ){
        this.personaModel = personaModel;
        recuperarPersona();
    }

    private void recuperarPersona() {
        this.personaModel.setNombre("Gaston");
        this.personaModel.setApellido("Pesoa");
        this.personaModel.setDni(123);
        this.personaModel.setSexo("Hombre");
    }

    public void setPersonaView(PersonaView personaView) {
        this.personaView = personaView;
         this.personaView.mostrarModelo();
    }

    

    public  boolean validarCarga(){
         if (this.personaModel.getNombre() != null && !this.personaModel.getNombre().isEmpty()){
            return true;
         } else {
             return  false;
         }
    }

    @Override
    public void onClick(View v) {
        this.personaView.guardarModelo();
        if(this.validarCarga()){
            Log.d("Guardar ok", personaModel.toString());
        } else {
            Log.d("Guardar error", personaModel.toString());
        }
    }
}
