package com.company;
import java.util.*;

public class Champs {

    // définition des variables et constantes de la classe
    final static int NBMINES = 5;
    final static int DIM = 5;
    Random alea = new Random(); // création d’un générateur
    boolean [ ] [ ] tabBool = new boolean [DIM][DIM] ;

    // définition des méthodes

    /**
     * Placement des mines
     */
    public void placeMines() {
        int x = 0; int y = 0;
        for (int i = 0; i < NBMINES; i++) {
            x = alea.nextInt(DIM); // tirage au sort nb ∈ [0,DIM-1]
            y = alea.nextInt(DIM); // tirage au sort nb ∈ [0,DIM-1]
            tabBool[x][y] = true;
        }
        for (int i = 0 ; i < DIM ; i ++){
            for (int j = 0 ; j < DIM ; j ++){
                if (tabBool[i][j] == false){
                    System.out.print(" o ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Champs ch = new Champs() ;
        ch.placeMines();
    }
}
