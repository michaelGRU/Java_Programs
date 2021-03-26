/**
 * @author michaelGRU
 * The program calculates and returns sum of fractions 1/2 + 2/3 + ... n/(n+1)
 * where value n is passed as parameter and defines the length of the pattern
 * and the sum. The program returns -1 if the value of n is less than 1.
 */
public class FractionSum {

    
    public static void main(String[] args) {
        

    }

    /**
     * Method calculates and returns the sum of fractions 1/2+2/3+...+ a/(a+1)
     *
     * @param n the limit of the fraction pattern
     * @return the sum of fractions; returns -1 if the parameter value is less
     * than 1
     */
    public static double fractionSum(int n) {

        double result = 0; //initilize the result and let it be zero

        if (n < 1) { //the method returns -1 if the value of n is less than 1
            return -1;
        }

        //fraction(2) = 1/2 + 2/3 = 2/3 + 1/2 
        // if n = 2, then fraction(n) = n/(n+1) + (n-1)/(n-1+1)
        // the function stops when the last term hits 1/2
        
        while (n >= 1) {  
            result += (double) n / (n + 1);     
            n--;                               
        }
        return result;
    }

}
