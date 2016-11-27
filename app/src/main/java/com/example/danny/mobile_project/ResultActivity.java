package com.example.danny.mobile_project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final ListView listViewResults = (ListView) findViewById(R.id.listViewResults);
        final Context cc = this;
        Bundle bundle = getIntent().getExtras();
        String ss = bundle.getString("search");

        List<String> results = new ArrayList<String>();
        results.add(ss);

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, results);

        listViewResults.setAdapter(adapt);

        listViewResults.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(cc, ShowSerie.class);
                intent.putExtra("title", listViewResults.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
    }
}