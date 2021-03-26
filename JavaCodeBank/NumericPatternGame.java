
import java.util.Scanner; //for user input

/*
@author michaelGRU
numeric pattern; It consists of an input validation method, and a menu-driven
main method. 

 */
public class NumericPatternGame {

    public static void main(String[] args) {

        Menu();

    }
//*********************************************************************************
    /**
     * The method displays a menu-driven user interaction part that displays a
     * menu and prompts the user to enter a choice and the size of the pattern.
     * The pattern will be printed to the console if the choice and the size are
     * appropriate, otherwise the method will keep asking the user to enter the
     * correct data type.
     */
    public static void Menu() {

        //store the size user entered
        int size;
        //store the user option as a boolean
        boolean userChoice;

        //for input validation 
        boolean again = true;

        do {
            //display menu 
            System.out.println("----------------------------------------------");
            System.out.println("Numeric Pattern Display");
            System.out.println("\t1. Print Type I pattern (like 12321)");
            System.out.println("\t2. Print Type II pattern (like 32123)");
            System.out.println("\t3. Quit");

            //validates user input, store the correct-type user input in userInput
             //the validateInt() method just returns an int value that user entered
            int userInput = validateInt("Enter your choice (1 - 3): ");

            switch (userInput) {
                case 3: //quits the program if the user enters 3 
                    System.out.println("Quitting Program");
                    again = false; //stop looping 
                    break;

                //if the user enters 1 or 2 
                case 1:
                case 2:
                    size = validateInt("Enter the size of the pattern(The size must be a positive integer): ");
                    if (size < 1) { //if the size is not a positive integer, repeat
                        System.out.println("\nPlease enter a positive integer!!!");

                        //keeps going until user entered a positive integer
                        while (size < 1) {
                            size = validateInt("\nInvalid. Enter the size of the pattern again: ");
                        }
                        userChoice = userInput == 1;

                        //print the pattern to console
                        System.out.println("\n>>>     " + numericPattern(size, userChoice) + "\n");

                        //go back to while loop
                    } else {
                        userChoice = userInput == 1;

                        //print the pattern to console
                        System.out.println("\n>>>     " + numericPattern(size, userChoice) + "\n");
                        //go back to loop, show menu, start over again unless 3 is entered
                    }
                    break;
                default: //when the user input is not 1, 2 or 3 
                    //not on the menu
                    System.out.println("\nYour choice is not on the menu!!!!!!!!\n");
                    //go back to loop, show menu
                    break;
            }
        } while (again); //keep looping unless user enters 3 
    }
//*********************************************************************************
    /**
     * The method asks user for input using the prompt string provided. It
     * validates input to make sure that the value entered is actually an
     * integer by using exception. The input prompt is repeated in the loop
     * until a correct data type is provided by the user.
     *
     * @param prompt A string that prompt the user for input
     * @return the integer value the the calling code
     * @throws IllegalArgumentException if the input type is not valid
     */
    public static int validateInt(String prompt) {
        //create a scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        String str;//to hold input string
        int num = 0;       // To hold an integer for an input option

        //loop input validation
        boolean again = true;

        //loop until an correct data type is given by the user
        while (again) {
            //asks user for input using prompt string provided
            System.out.print(prompt);
            str = keyboard.nextLine(); // get a string containing an int number
            str = str.trim(); // remove any extra whitespace from string sides

            try {
                num = Integer.parseInt(str);//convert the string into an int
                again = false; //exit loop if nothing funky happens

            } catch (IllegalArgumentException e) {
                System.out.println("\nInvalid input. Please enter an integer number!!");

            } catch (Exception e) { //just in case something unusual happens, use this to catch all
                System.out.println("Something is wrong");
                System.out.println(e.getMessage());
            }

        }

        return num;
    }
//*********************************************************************************
    /**
     * The method takes two parameters, size and direction, and return a string
     * with a pattern of numbers. Example: (5, true) returns string “123454321”
     * patternDisplay(5, false) returns string “543212345”
     * *************************************************************************
     * @param size defines the size of the pattern
     * @param direction defines the direction of the pattern
     * @return a string with a pattern of numbers
     * @throws IllegalArgumentException when the value of parameter size is a 0
     * or a negative number.
     */
    public static String numericPattern(int size, boolean direction) {

        String output = "";
        if (size > 0) {
            if (direction) {

                //prints 1 to size
                for (int i = 1; i <= size; i++) {
                    output += i;
                }
                //prints size-1 to 1
                for (int i = (size - 1); i >= 1; i--) {
                    output += i;
                }
            } else { //boolean direction must be false
                //prints size to 1
                for (int i = size; i >= 2; i--) {
                    output += i;
                }
                //prints 1 to size
                for (int i = 1; i <= size; i++) {
                    output += i;
                }
            }
        } else {
            //The method throws IllegalArgumentException when the value of parameter size is a 0 or a negative number.
            throw new IllegalArgumentException("The size of the pattern must "
                    + "be greater than 0. You entered " + size);

        }
        return output;
    }//end of method

}
