package com.example.sp2practica2_dani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class asistente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente);
        Spinner spinner = (Spinner) findViewById(R.id.frutas);

        final String[] conferencias = {"Elegir uno", "Conferencia de Ciencia, Innovación y Tecnologías", "Conferencia de Directores y Decanos de Ingeniería Informática", "Conferencia Latinoamericana de Informática"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, conferencias);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long i) {
                Toast.makeText(getApplicationContext(), "El elemento seleccionado es:" + adapterView.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                Intent i= new Intent(getApplicationContext(),inicio.class);
                startActivity(i);
            }


            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


    }
}