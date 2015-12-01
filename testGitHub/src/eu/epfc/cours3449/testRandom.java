/*
 8.6.2 The Random Class
    p.309
 */

package eu.epfc.cours3449;

import java.util.Random;


public class testRandom {
    public static void main(String[] args) {
        for (int j = 0; j < 2; j++) {
            Random r1 = new Random(3);
            for (int i = 0; i < 10; i++) {
                System.out.print(r1.nextInt(1000) + "  ");
            }
            System.out.println("");
        }
    }
}
