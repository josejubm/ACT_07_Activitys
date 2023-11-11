package com.example.act_07_variosactivitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RestaActivity extends AppCompatActivity {

    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        editTextNumero1 = findViewById(R.id.editTextNumero1Resta);
        editTextNumero2 = findViewById(R.id.editTextNumero2Resta);
        buttonCalcular = findViewById(R.id.buttonCalcularResta);
        textViewResultado = findViewById(R.id.textViewResultadoResta);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularResta();
            }
        });

        // Manejar el clic en el botón de regreso al inicio
        Button buttonRegresar = findViewById(R.id.buttonRegresarResta);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta actividad y vuelve a la actividad anterior (MainActivity)
            }
        });
    }

    private void calcularResta() {
        double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
        double numero2 = Double.parseDouble(editTextNumero2.getText().toString());

        double resultado = numero1 - numero2;

        textViewResultado.setText("Resultado: " + resultado);
    }
}