import br.com.alura.screenmatch.models.;


public class Program {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationMinute(180);

        myMovie.displayDataSheet();
        myMovie.avalia(8);
        myMovie.avalia(9);
        myMovie.avalia(7);

        System.out.println("Total de avaliações: " + myMovie.getTotalAvaliation());
        System.out.println(myMovie.average());




    }
}