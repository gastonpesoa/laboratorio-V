package com.example.holamundo;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MyListener implements View.OnClickListener {

    private Activity activity;
    private TextView textView = null;

    public Activity getActivity(){
        return this.activity;
    }
    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public MyListener(){

    }

    public  MyListener(Activity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        if (this.textView == null){
            this.textView = this.activity.findViewById(R.id.tvSaludar);
        }
        if (v.getId() == R.id.btnSaludor){
            this.textView.setText("Hola Gaston");
        } else if (v.getId() == R.id.btnReset){
            this.textView.setText("");
        }
    }

}
