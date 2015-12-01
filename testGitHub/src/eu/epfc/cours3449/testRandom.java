/*
 8.6.2 The Random Class
    p.309
 */

package eu.epfc.cours3449;

import java.util.Random;


public class testRandom {
    public static void main(String[] args) {
        Random r1 = new Random(3);
        for(int i = 0; i < 10 ; i++){
            System.out.print(r1.nextInt(1000) + "  ");
        }
        System.out.println("");
        Random r2 = new Random(4); //si paramètre identique => Random identique!!!
        for(int i = 0; i < 10 ; i++){
            System.out.print(r2.nextInt(1000) + "  ");
        }
    }
}
