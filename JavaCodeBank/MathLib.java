
/**
 *
 * @author michaelGRU
 * some of the useful Math functions
 */
public class MathLib {

    public static void main(String[] args) {
        double x = 2;
        
        double y = -3; 
        double z = Math.PI; //z = 3.1415926...
        
        Math.abs(y); //returns the absolute value of y
        Math.max(x, y); //returns the higher value of x and y
        Math.min(x, y); //returns the lower value of x and y
        Math.sqrt(x); //returns the square root of x
        Math.toRadians(x); //returns the value in radians;
        Math.sin(x); //trig
        Math.cos(x); 
        Math.tan(x);
        
        
        /*random num
        I don't like this approach, a better way would be to create a random
        object, see random.java
        */
        Math.random(); //returns a rand num between 0.0(inclusive) and 1.0 (exclusive)
        x = (int)(Math.random()*101); //a random number between 0 and 100
        
        
        

    }

}
