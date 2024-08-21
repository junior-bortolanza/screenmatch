import br.com.alura.screenmatach.calculo.CalculatorOfTime;
import br.com.alura.screenmatach.calculo.FilterRecomendation;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.sql.Array;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {


        Movie myMovie = new Movie("The Godfather", 1970);
        myMovie.setDurationMinute(180);
        System.out.println("Duration movie : "+myMovie.getDurationMinute());

        myMovie.displayDataSheet();
        myMovie.avalia(3);
        myMovie.avalia(5);
        myMovie.avalia(2);

        System.out.println("Total de avaliações: " + myMovie.getTotalAvaliation());
        System.out.println(myMovie.average());

        Serie mrrobot = new Serie("Mrrobot",2015);
        mrrobot.displayDataSheet();
        mrrobot.setSeason(10);
        mrrobot.setEpisodePerSeason(10);
        mrrobot.setMinutesPerEpisode(50);
        System.out.println("Duration to marathon Mrrobt "+ mrrobot.getDurationMinute());

        Movie otherMovie = new Movie("Deadpool", 2003);
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

        Movie movieCamila = new Movie("Mean Girls", 2004);
        movieCamila.setDurationMinute(90);
        movieCamila.avalia(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movieCamila);
        movieList.add(myMovie);
        movieList.add(otherMovie);
        System.out.println("Movies list: " + movieList.size());
        System.out.println("First Movie: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString of movie: " + movieList.get(0).toString());


    }
}
