package com.example.vesaf.vesafrijling_pset1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        ImageView image = (ImageView) findViewById(R.id.body);

        switch(view.getId()) {
            case R.id.nose_checkbox:
                image = (ImageView) findViewById(R.id.nose);
                break;
            case R.id.shoes_checkbox:
                image = (ImageView) findViewById(R.id.shoes);
                break;
            case R.id.arms_checkbox:
                image = (ImageView) findViewById(R.id.arms);
                break;
            case R.id.ears_checkbox:
                image = (ImageView) findViewById(R.id.ears);
                break;
            case R.id.eyebrows_checkbox:
                image = (ImageView) findViewById(R.id.eyebrows);
                break;
            case R.id.eyes_checkbox:
                image = (ImageView) findViewById(R.id.eyes);
                break;
            case R.id.glasses_checkbox:
                image = (ImageView) findViewById(R.id.glasses);
                break;
            case R.id.hat_checkbox:
                image = (ImageView) findViewById(R.id.hat);
                break;
            case R.id.mouth_checkbox:
                image = (ImageView) findViewById(R.id.mouth);
                break;
            case R.id.mustache_checkbox:
                image = (ImageView) findViewById(R.id.mustache);
                break;
        }
        if (checked) {
            image.setVisibility(VISIBLE);
        }
        else {
            image.setVisibility(INVISIBLE);
        }
    }
}
