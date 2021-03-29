package com.example.pruebacomercio;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.pruebacomercio.R.id.autouno;
import static com.example.pruebacomercio.R.id.bellezauno;
import static com.example.pruebacomercio.R.id.calzadouno;
import static com.example.pruebacomercio.R.id.deportesuno;
import static com.example.pruebacomercio.R.id.ferreteriauno;
import static com.example.pruebacomercio.R.id.hogaruno;
import static com.example.pruebacomercio.R.id.juguetesuno;
import static com.example.pruebacomercio.R.id.ofertasmes;
import static com.example.pruebacomercio.R.id.ropauno;
import static com.example.pruebacomercio.R.id.tecnouno;

public class MainActivity extends AppCompatActivity {

    ImageButton ImageButton;
    ImageButton RopaPrimero;
    ImageButton CalzadoPrimero;
    ImageButton TecnoPrimero;
    ImageButton HogarPrimero;
    ImageButton AutoPrimero;
    ImageButton DeportesPrimero;
    ImageButton BellezaPrimero;
    ImageButton JuguetesPrimero;
    ImageButton FerreteriaPrimero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton = (ImageButton) findViewById(ofertasmes);

        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ofertas_mensuales = new Intent(MainActivity.this, OfertasMensuales.class);
                startActivity(ofertas_mensuales);
            }
        });

        RopaPrimero = (ImageButton) findViewById(ropauno);

        RopaPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ropa_uno = new Intent(MainActivity.this, RopaUno.class);
                startActivity(ropa_uno);
            }
        });

        CalzadoPrimero = (ImageButton) findViewById(calzadouno);

        CalzadoPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calzado_uno = new Intent(MainActivity.this, CalzadoUno.class);
                startActivity(calzado_uno);

            }
        });

        TecnoPrimero = (ImageButton) findViewById(tecnouno);

        TecnoPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tecno_uno = new Intent(MainActivity.this, TecnoUno.class);
                startActivity(tecno_uno);

            }
        });
        HogarPrimero = (ImageButton) findViewById(hogaruno);

        HogarPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hogar_uno = new Intent(MainActivity.this, HogarUno.class);
                startActivity(hogar_uno);

            }
        });

        AutoPrimero = (ImageButton) findViewById(autouno);

        AutoPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent auto_uno = new Intent(MainActivity.this, AutoUno.class);
                startActivity(auto_uno);

            }
        });

        DeportesPrimero = (ImageButton) findViewById(deportesuno);

        DeportesPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deportes_uno = new Intent(MainActivity.this, DeportesUno.class);
                startActivity(deportes_uno);

            }
        });

        BellezaPrimero = (ImageButton) findViewById(bellezauno);

        BellezaPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent belleza_uno = new Intent(MainActivity.this, BellezaUno.class);
                startActivity(belleza_uno);

            }
        });


        JuguetesPrimero = (ImageButton) findViewById(juguetesuno);

        JuguetesPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent juguetes_uno = new Intent(MainActivity.this, JuguetesUno.class);
                startActivity(juguetes_uno);

            }
        });

        FerreteriaPrimero = (ImageButton) findViewById(ferreteriauno);

        FerreteriaPrimero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ferreteria_uno = new Intent(MainActivity.this, FerreteriaUno.class);
                startActivity(ferreteria_uno);

            }
        });
    }

}

