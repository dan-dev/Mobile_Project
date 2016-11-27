package com.example.danny.mobile_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final TextView result = (TextView) findViewById(R.id.result);

        Bundle bundle = getIntent().getExtras();
        String ss = bundle.getString("search");
        Log.d("log", ss);
        result.setText(ss);


    }
}