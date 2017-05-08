package com.example.benji.myratp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    public static String req1;
    public static String req2;
    public static String req3;
    public static String req4;
    public static String req5;
    public static String req6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        req1 = "https://api-ratp.pierre-grimaud.fr/v3/schedules/rers/b/Robinson/A";
        req2 = "https://api-ratp.pierre-grimaud.fr/v3/schedules/rers/b/Cité_Universitaire/R";
        req3 = "https://api-ratp.pierre-grimaud.fr/v3/schedules/tramways/3a/Cité_Universitaire/A";
        req4 = "https://api-ratp.pierre-grimaud.fr/v3/schedules/tramways/3a/Porte_d'Italie/R";
        req5 = "https://api-ratp.pierre-grimaud.fr/v3/schedules/metros/7/Porte_d'Italie/A";
        req6 = "https://api-ratp.pierre-grimaud.fr/v3/schedules/metros/7/Pierre_et_Marie_Curie/R";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, req1,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObj = new JSONObject(response);
                            JSONObject res = jsonObj.getJSONObject("result");
                            JSONArray sch = res.getJSONArray("schedules");
                            String info = sch.getString(0);
                            TextView rob1 = (TextView) findViewById(R.id.rob1);
                            String[] parts = info.split(",");
                            int i = 0;
                            while (parts[i] != null) {
                                if (parts[i].toLowerCase().contains("message".toLowerCase())) {
                                    rob1.setText(parts[i].substring(11, (parts[i].length() - 17)));
                                    break;
                                }
                                i++;
                            }
                        } catch (JSONException e) {
                            System.out.print("No work");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView rob1 = (TextView) findViewById(R.id.rob1);
                rob1.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);


        queue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, req2,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObj = new JSONObject(response);
                            JSONObject res = jsonObj.getJSONObject("result");
                            JSONArray sch = res.getJSONArray("schedules");
                            String info = sch.getString(0);
                            TextView cit1 = (TextView) findViewById(R.id.cit1);
                            String[] parts = info.split(",");
                            int i = 0;
                            while (parts[i] != null) {
                                if (parts[i].toLowerCase().contains("message".toLowerCase())) {
                                    cit1.setText(parts[i].substring(11, (parts[i].length() - 1)));
                                    break;
                                }
                                i++;
                            }
                        } catch (JSONException e) {
                            System.out.print("No work");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView cit1 = (TextView) findViewById(R.id.cit1);
                cit1.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);




        queue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, req3,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObj = new JSONObject(response);
                            JSONObject res = jsonObj.getJSONObject("result");
                            JSONArray sch = res.getJSONArray("schedules");
                            String info = sch.getString(0);
                            TextView cit2 = (TextView) findViewById(R.id.cit2);
                            String[] parts = info.split(",");
                            int i = 0;
                            while (parts[i] != null) {
                                if (parts[i].toLowerCase().contains("message".toLowerCase())) {
                                    cit2.setText(parts[i].substring(12, (parts[i].length() - 1)));
                                    break;
                                }
                                i++;
                            }
                        } catch (JSONException e) {
                            System.out.print("No work");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView cit2 = (TextView) findViewById(R.id.cit2);
                cit2.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);




        queue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, req4,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObj = new JSONObject(response);
                            JSONObject res = jsonObj.getJSONObject("result");
                            JSONArray sch = res.getJSONArray("schedules");
                            String info = sch.getString(0);
                            TextView por1 = (TextView) findViewById(R.id.por1);
                            String[] parts = info.split(",");
                            int i = 0;
                            while (parts[i] != null) {
                                if (parts[i].toLowerCase().contains("message".toLowerCase())) {
                                    por1.setText(parts[i].substring(12, (parts[i].length() - 1)));
                                    break;
                                }
                                i++;
                            }
                        } catch (JSONException e) {
                            System.out.print("No work");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView por1 = (TextView) findViewById(R.id.por1);
                por1.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);




        queue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, req5,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObj = new JSONObject(response);
                            JSONObject res = jsonObj.getJSONObject("result");
                            JSONArray sch = res.getJSONArray("schedules");
                            String info = sch.getString(0);
                            TextView por2 = (TextView) findViewById(R.id.por2);
                            String[] parts = info.split(",");
                            int i = 0;
                            while (parts[i] != null) {
                                if (parts[i].toLowerCase().contains("message".toLowerCase())) {
                                    por2.setText(parts[i].substring(12, (parts[i].length() - 1)));
                                    break;
                                }
                                i++;
                            }
                        } catch (JSONException e) {
                            System.out.print("No work");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView por2 = (TextView) findViewById(R.id.por2);
                por2.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);


        queue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, req6,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObj = new JSONObject(response);
                            JSONObject res = jsonObj.getJSONObject("result");
                            JSONArray sch = res.getJSONArray("schedules");
                            String info = sch.getString(0);
                            TextView pie1 = (TextView) findViewById(R.id.pie1);
                            String[] parts = info.split(",");
                            int i = 0;
                            while (parts[i] != null) {
                                if (parts[i].toLowerCase().contains("message".toLowerCase())) {
                                    pie1.setText(parts[i].substring(12, (parts[i].length() - 1)));
                                    break;
                                }
                                i++;
                            }
                        } catch (JSONException e) {
                            System.out.print("No work");
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                TextView pie1 = (TextView) findViewById(R.id.pie1);
                pie1.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);


    }
}
