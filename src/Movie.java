public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    double sumAvaliation;
    int totalAvaliation;
    int durationMinute;

    void displayDataSheet(){
        System.out.println("Movie name:" + name);
        System.out.println("Release Year: "+ releaseYear);

    }
    void avalia(double note){
        sumAvaliation += note;
        totalAvaliation++;
    }
    double average(){
        return sumAvaliation / totalAvaliation;
    }


}
