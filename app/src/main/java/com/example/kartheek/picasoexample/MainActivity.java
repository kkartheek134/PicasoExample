package com.example.kartheek.picasoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    String url="https://top10cinema.com/dataimages/36814/36814-002.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.butt);
        imageView=(ImageView)findViewById(R.id.image);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(MainActivity.this).load(url).error(android.R.drawable.ic_delete).placeholder(android.R.drawable.ic_input_add).resize(100,100).into(imageView);


            }
        });


    }
}
