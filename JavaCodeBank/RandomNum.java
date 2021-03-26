
/**
 *
 * @author michaelGRU
 * Generating a random number in a certain range
 */
import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        //define the range 
        int max = 100;
        int min = 0;

        Random rand = new Random(); //creating a random object
        int randNumber = rand.nextInt((max - min) + 1) + min;
        System.out.println(randNumber);

    }

}
