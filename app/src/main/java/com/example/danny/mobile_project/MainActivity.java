package com.example.danny.mobile_project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context cc = MainActivity.this;

        final Button searchButton = (Button) findViewById(R.id.search_button);
        final EditText searchText = (EditText) findViewById(R.id.search_field);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(cc, ResultActivity.class);
                intent.putExtra("search", searchText.getText().toString());
                startActivity(intent);
            }
        });
    }
}