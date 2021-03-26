
/**
 *
 * @author michaelGRU
 * 
 * Formatting with printf() 
 */

public class StringFormating {

    public static void main(String[] args) {
       //format: %[flags][width][.precision]conversion
       //flags can 1. display numbers with comma separators (,)
       //2. Pad numbers with leading zeros (0)
       //3. To left-justify numbers (-)  *by default the number is right justified 
       
       
       // s = strings
       // d = decimals
       // f = floating-point num
       // t = date/time 
       
       //Example 1
       double money = 12345.67;
        System.out.printf("Your number is %.2f\n", money); //round to 2 decimal places
        System.out.printf("Your number is %,.2f\n", money); //adding a (,) flag 
        System.out.printf("Your number is %020.2f\n", money); //adding leading 0s 

    }

}
