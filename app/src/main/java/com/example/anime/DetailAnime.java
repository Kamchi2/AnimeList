package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailAnime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);
        TextView animeName = findViewById(R.id.animeName);
        TextView name = findViewById(R.id.name);
        TextView series = findViewById(R.id.series);
        String animeNameValue = getIntent().getStringExtra("animeName");
        String nameValue = getIntent().getStringExtra("name");
        String seriesValue = getIntent().getStringExtra("series");
        animeName.setText("Anime name : " + animeNameValue);
        name.setText("Main character : " + nameValue);
        series.setText("Series count : " + seriesValue);
    }
}