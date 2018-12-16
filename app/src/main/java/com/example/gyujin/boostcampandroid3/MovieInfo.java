package com.example.gyujin.boostcampandroid3;

public class MovieInfo {
    public int drawble;
    public String movieTitle;
    public String year;
    public String actor;
    public int rate;

    public MovieInfo(int drawble, int rate, String movieTitle, String year, String actor){
        this.drawble = drawble;
        this.rate = rate;
        this.movieTitle = movieTitle;
        this.year = year;
        this.actor = actor;
    }

}
