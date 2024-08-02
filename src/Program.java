//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Godfather";
        myMovie.releaseYear = 1970;
        myMovie.durationMinute = 180;

        myMovie.displayDataSheet();
        System.out.println(myMovie);

        myMovie.avalia(8);
        myMovie.avalia(9);
        myMovie.avalia(7);
        myMovie.avalia(6);

        System.out.println(myMovie.sumAvaliation);
        System.out.println(myMovie.totalAvaliation);
        System.out.println(myMovie.average());




    }
}