package com.example.benji.myratp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String transport;
    public String numero;
    public String station;
    public String sens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button) findViewById(R.id.buttonrerb);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Actrerb.class);
                startActivityForResult(myIntent, 0);
            }
        });

        // Button RER

        Button rer = (Button) findViewById(R.id.toggleButtonRER);
        rer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                transport = "rers";
            }
        });


        // Button METRO

        Button metro = (Button) findViewById(R.id.toggleButtonMETRO);
        metro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                transport = "metros";
            }
        });

        // Button BUS

        Button bus = (Button) findViewById(R.id.toggleButtonBUS);
        bus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                transport = "bus";
            }
        });

        // Sens Aller

        Button sensall = (Button) findViewById(R.id.toggleButtonAller);
        sensall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                sens = "aller";
            }
        });

        // Sens Retour

        Button sensret = (Button) findViewById(R.id.toggleButtonRetour);
        sensret.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                sens = "retour";
            }
        });

        Button affi = (Button) findViewById(R.id.buttonChck);
        affi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                Intent myIntent = new Intent(view.getContext(), activity_affiche.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
