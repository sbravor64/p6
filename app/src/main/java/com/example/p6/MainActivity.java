package com.example.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointA,pointB;

    Button equipoAB1;
    Button equipoAB2;
    Button equipoAB3;

    Button equipoBB1;
    Button equipoBB2;
    Button equipoBB3;

    Button reset;

    TextView puntosA, puntosB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntosA = findViewById(R.id.pointA);
        puntosB = findViewById(R.id.pointB);


        equipoAB1 = findViewById(R.id.equipoABoton1);
        equipoAB2 = findViewById(R.id.equipoABoton2);
        equipoAB3 = findViewById(R.id.equipoABoton3);

        equipoBB1 = findViewById(R.id.equipoBBoton1);
        equipoBB2 = findViewById(R.id.equipoBBoton2);
        equipoBB3 = findViewById(R.id.equipoBBoton3);

        reset = findViewById(R.id.reset);


        equipoAB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA+=3;
                puntosA.setText(String.valueOf(pointA));
            }
        });

        equipoAB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA+=2;
                puntosA.setText(String.valueOf(pointA));
            }
        });

        equipoAB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA+=1;
                puntosA.setText(String.valueOf(pointA));
            }
        });

        equipoBB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointB+=3;
                puntosB.setText(String.valueOf(pointB));
            }
        });

        equipoBB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointB+=2;
                puntosB.setText(String.valueOf(pointB));
            }
        });

        equipoBB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointB+=1;
                puntosB.setText(String.valueOf(pointB));
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointB=0;
                pointA=0;
                puntosB.setText(String.valueOf(pointB));
                puntosA.setText(String.valueOf(pointA));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("puntosA", pointA);
        outState.putInt("puntosB", pointB);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        pointA = savedInstanceState.getInt("puntosA");
        puntosA.setText(String.valueOf(pointA));

        pointB = savedInstanceState.getInt("puntosB");
        puntosB.setText(String.valueOf(pointB));
    }

}
