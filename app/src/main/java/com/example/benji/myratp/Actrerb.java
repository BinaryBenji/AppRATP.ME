package com.example.benji.myratp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.*;

public class Actrerb extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actrerb);

        Button next = (Button) findViewById(R.id.buttonrerbback);
        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        final TextView rerbtxt = (TextView) findViewById(R.id.rerbtxt);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://api-ratp.pierre-grimaud.fr/v3/schedules/rers/b/Robinson/A";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() { @Override
                public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        rerbtxt.setText("Response is: "+ response.substring(0,500));
                        //rerbtxt.setText("Response is: hello");
                    }
                }, new Response.ErrorListener() { @Override
        public void onErrorResponse(VolleyError error) {
                rerbtxt.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);
    }
}