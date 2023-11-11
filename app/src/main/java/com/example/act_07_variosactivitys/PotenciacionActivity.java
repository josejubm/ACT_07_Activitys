package com.example.act_07_variosactivitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PotenciacionActivity extends AppCompatActivity {

    private EditText editTextBase;
    private EditText editTextExponente;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potenciacion);

        editTextBase = findViewById(R.id.editTextBase);
        editTextExponente = findViewById(R.id.editTextExponente);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPotenciacion();
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

    private void calcularPotenciacion() {
        double base = getDoubleFromEditText(editTextBase);
        double exponente = getDoubleFromEditText(editTextExponente);

        double resultado = Math.pow(base, exponente);

        textViewResultado.setText("Resultado: " + resultado);
    }

    private double getDoubleFromEditText(EditText editText) {
        String stringValue = editText.getText().toString();
        if (stringValue.isEmpty()) {
            return 0.0;
        } else {
            return Double.parseDouble(stringValue);
        }
    }
}
