package br.com.alura.screenmatch.models;

import br.com.alura.screenmatach.calculo.Classify;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double sumAvaliation;
    private int totalAvaliation;
    private int durationMinute;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getDurationMinute() {
        return durationMinute;
    }

    public int getTotalAvaliation(){
        return totalAvaliation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setDurationMinute(int durationMinute) {
        this.durationMinute = durationMinute;
    }

    public void displayDataSheet(){
        System.out.println("name: " + name);
        System.out.println("Release Year: "+ releaseYear);

    }
    public void avalia(double note){
        sumAvaliation += note;
        totalAvaliation++;
    }
    public double average(){
        return sumAvaliation / totalAvaliation;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
