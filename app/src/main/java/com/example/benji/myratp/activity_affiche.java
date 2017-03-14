package com.example.benji.myratp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_affiche extends AppCompatActivity{

    public String fullurl;
    String deburl ="https://api-ratp.pierre-grimaud.fr/v3/schedules/";
    // fullurl = deburl + "/" +  transports + "/" + numero + "/" + station + "/" + sens

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche);
    }
}
