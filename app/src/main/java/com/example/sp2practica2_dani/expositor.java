package com.example.sp2practica2_dani;

import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sp2practica2_dani.dialogo.dialogoexpositor;

public class expositor extends AppCompatActivity {
    Button btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expositor);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "REGISTRO DE ASISTENTE", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(), Fragment.InstantiationException);
                startActivity(i);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "REGRESASTE A INICIO", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }

        });
    }

}
