package br.com.alura.screenmatach.calculo;
import br.com.alura.screenmatch.models.Title;

public class CalculatorOfTime {
    private int timeTotal;

    public int getTimeTotal(){
        return timeTotal;

    }
//    public void included(Movie m){
//        timeTotal += m.getDurationMinute();
//
//    }
//
//    public void included(Serie s){
//        timeTotal += s.getDurationMinute();
//    }
//}
    public void included(Title title){
        this.timeTotal += title.getDurationMinute();
    }
}
