import br.com.alura.screenmatach.calculo.CalculatorOfTime;
import br.com.alura.screenmatach.calculo.FilterRecomendation;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Program {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationMinute(180);
        System.out.println("Duração filme: "+myMovie.getDurationMinute());

        myMovie.displayDataSheet();
        myMovie.avalia(3);
        myMovie.avalia(5);
        myMovie.avalia(2);

        System.out.println("Total de avaliações: " + myMovie.getTotalAvaliation());
        System.out.println(myMovie.average());

        Serie mrrobot = new Serie();
        mrrobot.setName("Mrrobot");
        mrrobot.setReleaseYear(1990);
        mrrobot.displayDataSheet();
        mrrobot.setSeason(10);
        mrrobot.setEpisodePerSeason(10);
        mrrobot.setMinutesPerEpisode(50);
        System.out.println("Duration to marathon Mrrobt "+ mrrobot.getDurationMinute());

        Movie otherMovie = new Movie();
        otherMovie.setName("Deadpool");
        otherMovie.setReleaseYear(2023);
        otherMovie.setDurationMinute(200);

        CalculatorOfTime calculator = new CalculatorOfTime();
        calculator.included(myMovie);
        calculator.included(otherMovie);
        System.out.println(calculator.getTimeTotal());

        FilterRecomendation filter = new FilterRecomendation();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mrrobot);
        episode.setTotalViews(300);
        filter.filter(episode);




    }
}