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

        if (savedInstanceState != null) {
            if (savedInstanceState.getBoolean("ARMS_VISIBILITY")) {
                findViewById(R.id.arms).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("EARS_VISIBILITY")) {
                findViewById(R.id.ears).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("EYEBROWS_VISIBILITY")) {
                findViewById(R.id.eyebrows).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("EYES_VISIBILITY")) {
                findViewById(R.id.eyes).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("GLASSES_VISIBILITY")) {
                findViewById(R.id.glasses).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("HAT_VISIBILITY")) {
                findViewById(R.id.hat).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("MOUTH_VISIBILITY")) {
                findViewById(R.id.mouth).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("MUSTACHE_VISIBILITY")) {
                findViewById(R.id.mustache).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("NOSE_VISIBILITY")) {
                findViewById(R.id.nose).setVisibility(VISIBLE);
            }
            if (savedInstanceState.getBoolean("SHOES_VISIBILITY")) {
                findViewById(R.id.shoes).setVisibility(VISIBLE);
            }
        }
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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (findViewById(R.id.arms).getVisibility() == View.VISIBLE) {
            outState.putBoolean("ARMS_VISIBILITY", true);
        }
        if (findViewById(R.id.ears).getVisibility() == View.VISIBLE) {
            outState.putBoolean("EARS_VISIBILITY", true);
        }
        if (findViewById(R.id.eyebrows).getVisibility() == View.VISIBLE) {
            outState.putBoolean("EYEBROWS_VISIBILITY", true);
        }
        if (findViewById(R.id.eyes).getVisibility() == View.VISIBLE) {
            outState.putBoolean("EYES_VISIBILITY", true);
        }
        if (findViewById(R.id.glasses).getVisibility() == View.VISIBLE) {
            outState.putBoolean("GLASSES_VISIBILITY", true);
        }
        if (findViewById(R.id.hat).getVisibility() == View.VISIBLE) {
            outState.putBoolean("HAT_VISIBILITY", true);
        }
        if (findViewById(R.id.mouth).getVisibility() == View.VISIBLE) {
            outState.putBoolean("MOUTH_VISIBILITY", true);
        }
        if (findViewById(R.id.mustache).getVisibility() == View.VISIBLE) {
            outState.putBoolean("MUSTACHE_VISIBILITY", true);
        }
        if (findViewById(R.id.nose).getVisibility() == View.VISIBLE) {
            outState.putBoolean("NOSE_VISIBILITY", true);
        }
        if (findViewById(R.id.shoes).getVisibility() == View.VISIBLE) {
            outState.putBoolean("SHOES_VISIBILITY", true);
        }
    }
}
