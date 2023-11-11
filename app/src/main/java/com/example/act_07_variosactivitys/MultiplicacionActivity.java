package com.example.act_07_variosactivitys;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MultiplicacionActivity extends AppCompatActivity {

    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private Button buttonCalcular;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMultiplicacion();
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

    private void calcularMultiplicacion() {
        double factor1 = getDoubleFromEditText(editTextNumero1);
        double factor2 = getDoubleFromEditText(editTextNumero2);

        double resultado = factor1 * factor2;

        textViewResultado.setText("Resultado: " + resultado);
    }

    private double getDoubleFromEditText(EditText editText) {
        String text = editText.getText().toString();
        if (text.isEmpty()) {
            return 0.0; // O cualquier valor predeterminado que desees
        } else {
            return Double.parseDouble(text);
        }
    }
}