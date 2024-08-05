package br.com.alura.screenmatch.models;

public class Titulo {
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double sumAvaliation;
    private int totalAvaliation;
    private int durationMinute;


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
        System.out.println("br.com.alura.screenmatch.models.Movie name:" + name);
        System.out.println("Release Year: "+ releaseYear);

    }
    public void avalia(double note){
        sumAvaliation += note;
        totalAvaliation++;
    }
    public double average(){
        return sumAvaliation / totalAvaliation;
    }

}


