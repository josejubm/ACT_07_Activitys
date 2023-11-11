package com.example.act_07_variosactivitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SumaActivity extends AppCompatActivity {

    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularSuma();
            }
        });

        // Manejar el clic en el botón de regreso al inicio
        Button buttonRegresar = findViewById(R.id.buttonRegresar);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta actividad y vuelve a la actividad anterior (MainActivity)
            }
        });
    }

    private void calcularSuma() {
        try {
            double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
            double numero2 = Double.parseDouble(editTextNumero2.getText().toString());

            double resultado = numero1 + numero2;

            textViewResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            textViewResultado.setText("Ingrese números válidos");
        }
    }
}