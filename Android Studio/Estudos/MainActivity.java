package com.example.posto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText precoGasolina, precoEtanol;
    Button btnCalcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoGasolina = findViewById(R.id.precoGasolina);
        precoEtanol = findViewById(R.id.precoEtanol);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.resultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gText = precoGasolina.getText().toString().trim();
                String eText = precoEtanol.getText().toString().trim();

                double gasolina = Double.parseDouble(gText.replace(",", "."));
                double etanol = Double.parseDouble(eText.replace(",", "."));

                double relacao = etanol / gasolina;

                if (relacao < 0.7) {
                    resultado.setText("Abasteça com etanol");
                } else {
                    resultado.setText("Abasteça com gasolina");
                }
            }
        });
    }
}
