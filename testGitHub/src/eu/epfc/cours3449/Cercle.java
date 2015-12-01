
package eu.epfc.cours3449;


public class Cercle {
    static int nbInstance = 0;
    double rayon;
    
    public Cercle(double rayon){
        this.rayon = rayon;
        nbInstance++;
    }
    public double getAire(){
        return Math.PI*rayon*rayon;
    }
}
