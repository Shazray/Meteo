package com.example.virgi.meteo.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.virgi.meteo.R;

/**
 * Created by virgi on 30/03/2018.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        Intent intent = getIntent();

        String inputName = intent.getStringExtra("name");


        Bundle bundle = getIntent().getExtras();
        int inputColor = bundle.getInt("color", -1);

        ImageView contactImage = (ImageView) findViewById(R.id.imageItemSelected);
        TextView nameText = (TextView) findViewById(R.id.nameItemSelected);

        contactImage.setBackgroundColor(inputColor);
        nameText.setText(inputName);



        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}



