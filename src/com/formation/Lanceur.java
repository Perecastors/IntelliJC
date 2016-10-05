package com.formation;

/**
 * Created by Formation on 05/10/2016.
 */
public class Lanceur {

    public static void main(String[] args) {
        Panneau bj = new Panneau("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        bj.affiche();
        Panneau bj2 = new Panneau("ABCDEFGHIJ");
        bj2.affiche();
        }
}
