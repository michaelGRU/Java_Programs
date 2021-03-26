
/**
 *
 * @author michaelGRU
 *
 * Given two variables, x and y, swap the variables
 */
public class SwapVariables {

    public static void main(String[] args) {
        //method 1: use a third temp variable 
        int x = 1;
        int y = 0;

        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);

        //method 2: use arithmetic operators
        int x1 = 1;
        int y1 = 0;
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println(x1 + " " + y1);

    }

}
