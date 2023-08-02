package com.example.sp2practica2_dani.dialogo;

import static com.google.android.material.internal.ContextUtils.getActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sp2practica2_dani.R;

import java.util.Locale;


public class dialogoexpositor extends DialogFragment {
    Button btn5,btn6;
    EditText editn,editc,editco,editt;
    SharedPreferences preferences;

    public dialogoexpositor() {
    }
    @NonNull
    @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            return crearDialogoGestionUsuario();
        }

        private AlertDialog crearDialogoGestionUsuario() {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

            LayoutInflater inflater = getActivity().getLayoutInflater();
            View v = inflater.inflate(R.layout.fragment_dialogoexpositor, null);

            builder.setView(v);
            btn5=v.findViewById(R.id.btn5);
            btn6=v.findViewById(R.id.btn6);
            editn =v.findViewById(R.id.editnombre);
            editc=v.findViewById(R.id.editdirec);
            editco =v.findViewById(R.id.editcorreo);
            editt=v.findViewById(R.id.edittema);
            eventosBotones();
            guardarDatos(String name, String cel, String cor, String tem);
            return builder.create();

    }
    private void eventosBotones() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCampos();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }
    private void validarCampos() {
        String nombre="", celular="", correo="",tema="";
        nombre=editn.getText().toString();
        celular=editc.getText().toString();
        correo=editco.getText().toString();
        tema=editt.getText().toString();
        String error="";error+="";
        if (nombre.equals("") || celular.equals("") ||correo.equals("") ||tema.equals("") ||)
            error="--No puedes dejar campos vacios";
        if(!error.equals(""))
            Toast.makeText(getActivity(), "ERROR"+error, Toast.LENGTH_LONG).show();
        else {
            guardarDatos (nombre,celular,correo,tema.toLowerCase(Locale.ROOT));
            Intent i= new Intent(getActivity(),inicio.class);
            startActivity(i);
            Toast.makeText(getActivity(), "Sus datos fueron guardados correctamente"+nombre, Toast.LENGTH_LONG).show();
        }
        private void guardarDatos(String nombre, String celular, String correo, String tema){
            getActivity().getSharedPreferences("activity:main", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= preferences.edit();
            editor.putString("nombre",nombre);
            editor.putString("celular",celular);
            editor.putString("correo",correo);
            editor.putString("tema",tema);

            editor.commit();
        }
    }



}