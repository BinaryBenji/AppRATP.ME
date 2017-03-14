package com.example.benji.myratp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_affiche extends AppCompatActivity{

    // req
    MainActivity main;
    public String req;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        final TextView thetime = (TextView) findViewById(R.id.txtTime);
        thetime.setText(req);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche);
    }
    public void Creat_activity_affiche(String req)
    {
        this.req = req;
    }
}
