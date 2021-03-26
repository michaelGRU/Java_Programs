/**
 * @author michaelGRU
 * The program takes an integer number that is either positive or negative, and
 * finds and returns the largest digit in that number.
 * For instance, 8 is the largest number is 438143
 */
public class getLargestDigitInaNumber {

 
    public static void main(String[] args) {
       

    }

    /**
     * Method finds and returns the largest digit in a given number
     *
     * @param num the number to analyze
     * @return the largest digit
     */
    public static int getLargestDigit(int num) {

        int largestDigit = 0; //initially set the largest digit to 0

        if (num < 0) { //if the number is negative, make it positive
            num = Math.abs(num);
        }
        //if the number is zero, return the largestDigit, which is initialized
        // as 0 (ie. 0 is the largest digit in 0. 
        // if the number is non-zero, check the last digit using %
        while (num != 0) {  
            int lastDigit = num % 10; 
            if (lastDigit > largestDigit) {
                largestDigit = lastDigit; 
            }
            num = num / 10; //get rid of the last digit, and keep checking as long as num != 0
        }
        return largestDigit;
    }

 
}//end of class
