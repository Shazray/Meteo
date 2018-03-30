package com.example.virgi.meteo.ui.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.virgi.meteo.R;
import com.example.virgi.meteo.data.City;
import com.example.virgi.meteo.data.CitySingleton;
import com.example.virgi.meteo.data.ServiceQueueSingleton;
import com.example.virgi.meteo.logic.GsonRequest;

/**
 * Created by virgi on 30/03/2018.
 */

public class DetailActivity extends Activity {

    private final TextView textView = (TextView) findViewById(R.id.nameItemSelected);
    private final ImageView image = (ImageView) findViewById(R.id.imageItemSelected);
    private final TextView description = (TextView) findViewById(R.id.descrizione);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        Bundle intent = getIntent().getExtras();

        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Loading..");
        dialog.show();
        String data = intent.getString("città");
        String url = "http://api.openweathermap.org/data/2.5/weather";
        String appId ="q=Roma&2439d518e81cee90fd7a61cfe1109dd4";

        GsonRequest jsonObjectReq = new GsonRequest(url+"?"+"q="+data+"&"+appId, City.class, null,
                new Response.Listener<City>() {
                    @Override
                    public void onResponse(City response) {

                        textView.setText(response.getName());
                        description.setText(response.toString());

                    }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        // Access the RequestQueue through your singleton class.
        ServiceQueueSingleton.getInstance(this).addToRequestQueue(jsonObjectReq);




        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}



