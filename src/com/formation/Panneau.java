package com.formation;

/**
 * Created by Formation on 05/10/2016.
 */
public class Panneau {

    private static final String FORME="yoyo";

    private String message;

    public Panneau(String message){
        this.message = message;
    }

    public void affiche(){
        if(message.length() > 10){
            System.out.println(message.substring(0,10)+"...");
        }
        else {
            System.out.println(message);
        }
    }
}
