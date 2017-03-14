package com.example.benji.myratp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    public static String transport;
    public static String numero;
    public static String station;
    public static String sens;
    public static String req;
    //activity_affiche activity_affiche = new activity_affiche();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //activity_affiche.Creat_activity_affiche(req);
        setContentView(R.layout.activity_main);

        /*Button next = (Button) findViewById(R.id.buttonrerb);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Actrerb.class);
                startActivityForResult(myIntent, 0);
            }
        });*/

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
                sens = "A";
            }
        });

        // Sens Retour

        Button sensret = (Button) findViewById(R.id.toggleButtonRetour);
        sensret.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                sens = "R";
            }
        });

        Button affi = (Button) findViewById(R.id.buttonChck);
        affi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                // NUM

                EditText editnum  = (EditText)findViewById(R.id.txtNum);
                numero =  editnum.getText().toString();

                // STATION

                EditText editstat  = (EditText)findViewById(R.id.txtStat);
                station =  editstat.getText().toString();

                // REQ

                req = "https://api-ratp.pierre-grimaud.fr/v3/schedules/" +  transport + "/" + numero + "/" + station + "/" + sens;
                //activity_affiche.Creat_activity_affiche(req);
                System.out.println("main : " + req);

                Intent myIntent = new Intent(view.getContext(), activity_affiche.class);
                startActivityForResult(myIntent, 0);
            }

        });

   /* private void Affiche()
    {
        ArrayAdapter<activity_affiche> = new
    }

    private class TimeAdapter extends ArrayAdapter<activity_affiche>
    {
        public TimeAdapter(){}
    }*/

    }
}
