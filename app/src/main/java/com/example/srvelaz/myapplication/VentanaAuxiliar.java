package com.example.srvelaz.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by SrVelaz on 8/11/2015.
 */
public class VentanaAuxiliar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_auxiliar);


    }

    public void botonSegundoOnClick(View view) {

        EditText nombreET = (EditText) findViewById(R.id.nombreEditTextID);
        EditText edadET = (EditText) findViewById(R.id.edadEditTextID);
        EditText generoET = (EditText) findViewById(R.id.generoEditTextID);

        String nombreString2 = String.valueOf(nombreET.getText());
        String edadString2 = String.valueOf(edadET.getText());
        String generoString2 = String.valueOf(generoET.getText());

        Intent devolverDatosIntent = new Intent();
        devolverDatosIntent.putExtra("nombre", nombreString2);
        devolverDatosIntent.putExtra("edad", edadString2);
        devolverDatosIntent.putExtra("genero",generoString2);

        setResult(RESULT_OK, devolverDatosIntent);
        finish();


    }
}
