
/**
 *
 * @author michaelGRU
 *
 * Prompt the user to enter an input 
 */
import java.util.Scanner;
public class scannerInput {

    public static void main(String[] args) {
        
        //Example 1 
        Scanner keyboard = new Scanner(System.in); //create a Scanner object
        System.out.print("Please enter a number: "); //always remember to prompt the user 
        int number = keyboard.nextInt();
        System.out.println("The number you entered is " + number);
        
        
        //Example 2 
        /*Pressing the Enter key causes a newline character to be stroed in the 
        keyboard buffer, sometimes we have to consume the remaining newline*/
        String str; int num; double dub;
        System.out.print("num? ");
        num = keyboard.nextInt();
        System.out.print("Double? ");
        dub = keyboard.nextDouble();
        /**
         * This here is important 
         */
        keyboard.nextLine(); //we want to consume the remaining newline
        System.out.print("str? ");
        str = keyboard.nextLine();
        System.out.println(num + " " + dub + " " + str);
        
        
        
        

    }

}
