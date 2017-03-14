package com.example.benji.myratp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class activity_affiche extends AppCompatActivity{

    // req
    //MainActivity main;

    public String requ = MainActivity.req;
    public String transp = MainActivity.transport;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche);
        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, requ,
                new Response.Listener<String>() { @Override
                public void onResponse(String response) {
                    try {
                        JSONObject jsonObj = new JSONObject(response);
                        JSONObject res = jsonObj.getJSONObject("result");
                        JSONArray sch = res.getJSONArray("schedules");
                        String info = sch.getString(1);
                        TextView ttxt = (TextView) findViewById(R.id.txtTime);

                        String[] parts = info.split(",");
                        int i = 0;
                        while (parts[i] != null) {
                            if(parts[i].toLowerCase().contains("message".toLowerCase())) {
                                ttxt.setText(parts[i].substring(11, (parts[i].length()-1)));
                                break;
                            }
                            i++;
                        }
                    }
                    catch(JSONException e) {
                        System.out.print("No work");
                    }
                }
                }, new Response.ErrorListener() { @Override
        public void onErrorResponse(VolleyError error) {
            TextView ttxt = (TextView) findViewById(R.id.txtTime);
            ttxt.setText("That didn't work!");
        }

        });
        queue.add(stringRequest);



        /*System.out.println("Sec : " + requ);
        TextView thetime = (TextView) findViewById(R.id.txtTime);
        thetime.setText(requ.toString());*/


    }
}
