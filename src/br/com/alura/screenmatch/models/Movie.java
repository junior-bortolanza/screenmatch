package br.com.alura.screenmatch.models;

public class Movie extends Title {
    private String director;

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
}