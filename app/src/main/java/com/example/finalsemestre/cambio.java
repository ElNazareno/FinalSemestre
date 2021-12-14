package com.example.finalsemestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class cambio extends AppCompatActivity {
    Spinner mact,mconv;
    EditText mont;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio);

        mact=findViewById(R.id.spinnerMonedaActual);
        mconv=findViewById(R.id.spinnerMonedaCambio);
        mont=findViewById(R.id.txtMonto);
        res=findViewById(R.id.lblRespuesta);

        String [] monedas={"Dolar","Sol","Euro"};

        ArrayAdapter<String> monact = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,monedas);
        mact.setAdapter(monact);
        ArrayAdapter <String> monconv = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,monedas);
        mconv.setAdapter(monconv);
    }

    public void convertir(View view) {
        Double num = Double.parseDouble(mont.getText().toString());
        Double aux;

        String monedaAct = mact.getSelectedItem().toString();
        String monedaConv = mconv.getSelectedItem().toString();

        switch (monedaAct){
            case("Dolar"):
                switch (monedaConv){
                    case("Sol"):
                        aux=num*4.08;
                        res.setText(aux.toString()+" Soles");
                        break;
                    case("Euro"):
                        aux=num*0.89;
                        res.setText(aux.toString()+" Euros");
                        break;
                    default:
                        res.setText(":/");
                        break;
                }
                break;
            case("Sol"):
                switch (monedaConv){
                    case("Dolar"):
                        aux=num*0.25;
                        res.setText(aux.toString()+" Dolares");
                        break;
                    case("Euro"):
                        aux=num*0.22;
                        res.setText(aux.toString()+" Euros");
                        break;
                    default:
                        res.setText(":/");
                        break;
                }
                break;
            case("Euro"):
                switch (monedaConv){
                    case("Sol"):
                        aux=num*4.6;
                        res.setText(aux.toString()+" Soles");
                        break;
                    case("Dolar"):
                        aux=num*1.13;
                        res.setText(aux.toString()+" Dolares");
                        break;
                    default:
                        res.setText(":/");
                        break;
                }
                break;
            default:
                break;
        }
    }
}