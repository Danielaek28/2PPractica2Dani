package com.example.sp2practica2_dani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "REGISTRO DE ASISTENTE", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),asistente.class);
                startActivity(i);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "REGISTRO DE EXPOSITOR", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(getApplicationContext(),expositor.class);
                startActivity(i);
            }

        });
    }
}