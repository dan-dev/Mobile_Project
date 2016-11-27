package com.example.danny.mobile_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowSerie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_serie);

        final TextView title = (TextView) findViewById(R.id.text_title);
        final TextView nEps = (TextView) findViewById(R.id.text_number_eps);
        final TextView descrip = (TextView) findViewById(R.id.text_description);
        final TextView actors = (TextView) findViewById(R.id.text_actors);
        final ImageView img = (ImageView) findViewById(R.id.serie_image);

        Bundle bundle = getIntent().getExtras();
        String ss = bundle.getString("title");
        title.setText(ss);

        img.setImageResource(R.drawable.yeezus);
        descrip.setText(descrip.getText() + "Series about a God.");
        actors.setText(actors.getText() + "Kanye West, Yeezy, Drake");
        nEps.setText(nEps.getText() + "24");
    }
}
