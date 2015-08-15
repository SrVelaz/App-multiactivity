package com.example.srvelaz.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void botonPrimeroOnClick(View view) {

        final int resultado = 1;
        Intent rellenarDatosIntent = new Intent(this, VentanaAuxiliar.class );
        startActivityForResult(rellenarDatosIntent, resultado);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView nombreTextView = (TextView) findViewById(R.id.nombreTextViewID);
        TextView edadTextView = (TextView) findViewById(R.id.edadTextViewID);
        TextView generoTextView = (TextView) findViewById(R.id.generoTextViewID);

        String nombreString1 = data.getStringExtra("nombre");
        String edadString1 = data.getStringExtra("edad");
        String generoString1 = data.getStringExtra("genero");

        nombreTextView.setText(nombreString1);
        edadTextView.setText(edadString1);
        generoTextView.setText(generoString1);
    }
}
