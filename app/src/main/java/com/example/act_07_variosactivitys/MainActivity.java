package com.example.act_07_variosactivitys;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        Button btnDivision = findViewById(R.id.btnDivision);
        Button btnPotenciacion = findViewById(R.id.btnPotenciacion);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(SumaActivity.class);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(RestaActivity.class);
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(MultiplicacionActivity.class);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(DivisionActivity.class);
            }
        });

        btnPotenciacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(PotenciacionActivity.class);
            }
        });
    }

    private void abrirActividad(Class<?> actividad) {
        Intent intent = new Intent(this, actividad);
        startActivity(intent);
    }
}