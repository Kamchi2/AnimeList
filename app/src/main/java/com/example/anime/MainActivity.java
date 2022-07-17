package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import com.example.anime.AnimeAdapter;
import com.example.anime.DetailAnime;
import com.example.anime.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClicker {
    AnimeAdapter animeAdapter;

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        ArrayList<String> list = new ArrayList<String>();
        list.add("Naruto");
        list.add("Attack on Titan");
        list.add("Homeless God");
        list.add("One Punch Man");
        animeAdapter = new AnimeAdapter(list, this);
        binding.recyclerView.setAdapter(animeAdapter);
        setContentView(binding.getRoot());
    }

    @Override
    public void itemClick(int position) {
        switch (position) {
            case 0:
                Intent intent = new Intent(MainActivity.this, DetailAnime.class);
                intent.putExtra("animeName","Naruto");
                intent.putExtra("name","Naruto");
                intent.putExtra("series","977");
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(MainActivity.this, DetailAnime.class);
                intent1.putExtra("animeName","Attack of Titans");
                intent1.putExtra("name","Eren Yege");
                intent1.putExtra("series","87");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(MainActivity.this, DetailAnime.class);
                intent2.putExtra("animeName","Attack of Titans");
                intent2.putExtra("name","Yato");
                intent2.putExtra("series","25");
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(MainActivity.this, DetailAnime.class);
                intent3.putExtra("animeName","One Punch Man");
                intent3.putExtra("name","Saitama");
                intent3.putExtra("series","24");
                startActivity(intent3);
                break;
        }
    }
}