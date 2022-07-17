package com.example.AnimeList;

import java.io.Serializable;

public class AnimeModel implements Serializable {
    String nameAnime;
    String name;
    String numberSeries;

    public AnimeModel(String animeName, String name, String series) {
        this.nameAnime = animeName;
        this.name = name;
        this.numberSeries = series;
    }
}
