package br.com.alura.screenmatch.models;

import br.com.alura.screenmatach.calculo.Classify;

import java.io.Serializable;

public class Episode implements Classify{
    private int number;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassify() {
        if(totalViews > 100){
            return 4;
        } else{
            return 2;
        }
    }
}
