package br.com.alura.screenmatach.calculo;

public class FilterRecomendation {
    private String recomendation;

    public void filter(Classify classify){
        if(classify.getClassify() >= 4){
            System.out.println(" This is one of favorites at the moment!  ");
        } else if(classify.getClassify() >= 2){
            System.out.println("Very good evaluation at the moement");
        } else{
            System.out.println("Put in in your list to watch later");
        }
    }
}
