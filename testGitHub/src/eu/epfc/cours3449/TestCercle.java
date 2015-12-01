
package eu.epfc.cours3449;


public class TestCercle {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(20);
        Cercle c2 = new Cercle(5);
        
        System.out.println(Cercle.nbInstance);
        System.out.println(c1.getAire());
    }
 
}
