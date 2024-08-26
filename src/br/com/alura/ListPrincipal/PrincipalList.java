package br.com.alura.ListPrincipal;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;


import java.util.ArrayList;
import java.util.Collections;

public class PrincipalList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("the Godfather", 1970);
        myMovie.avalia(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.avalia(6);
        var movieCAmila = new Movie("Man Girl", 2003);
        movieCAmila.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Movie f1 = movieCAmila;

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(movieCAmila);
        lista.add(myMovie);
        lista.add(otherMovie);
        lista.add(lost);
        for (Title item: lista) {
            System.out.println(item.getName());
            if (item instanceof  Movie movie && movie.getClassify()> 2) {
                System.out.println("Classify " + movie.getClassify());
            }

        }

        ArrayList<String> searchArtist = new ArrayList<>();
        searchArtist.add("Adam Sandler");
        searchArtist.add("Junior");
        searchArtist.add("Camila");
        System.out.println(searchArtist);

        Collections.sort(searchArtist);
        System.out.println("After sorts" + searchArtist);
        Collections.sort(lista);
        System.out.println(lista);


    }
}

