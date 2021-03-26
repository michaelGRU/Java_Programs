/**
 * @author michaelGRU
 * The program can be used as a math tutor for young students. The program
 * displays a menu allowing the user to select an addition or subtraction
 * problem. Two random numbers are generated for students to solve. The final
 * selection of the menu will let the user quit the program.
 */

import java.util.Scanner; //import Scanner
import java.util.Random; //The random class is used to generate random numbers

public class MathTutor {

    public static void main(String[] args) {
        menu();
        doMath();
    
    }

    /**
     * display menu
     */
    public static void menu() {
        System.out.println("Math Tutor");
        System.out.println("\t1. Addition problem");
        System.out.println("\t2. Subtraction problem");
        System.out.println("\t3. Quit");
        System.out.print("Enter your choice (1 - 3): ");
    }
    
    /**
     * 1. The method prompts the user to enter a number between 1-3
     * 2. If the initial user input is 3, quit the program
     * 3. If the initial user input is not 3. However, it is not 1 or 2 either
     *    The program displays no such choice in the menu. A menu is then 
     *    displayed again, and prompts the user to enter again.
     * 4. If the user continues to enter a number that is not on the menu, menu
     *    will be displayed again, and user will be asked to enter another number
     *    This repeats itself until user enters a valid number. 
     * 5. If the user input is 3, the program exits. 
     * 6. If the user input is 1 or 2, case 1 will execute if it were 1n and 
     *    case 2 will execute if it were 2. 
     * 7. Case 1 displays two random numbers, and prompts the user to find the 
     *    sum of the two numbers. Case 2 displays two random numbers, and prompts
     *    the user to find the subtraction of the two numbers.
     * 8. Once the user enters the answer, the method will display if the answer
     *    is right or wrong. Subsequently, the menu is shown again, and asks the 
     *    user to either enter 1 for addition, 2 for subtraction, and 3 to quit. 
     * 
     * 
     *  
     * 
     */
    
    
    public static void doMath() {
        Scanner console = new Scanner(System.in); //Create a Scanner object

        //define the upper and lower limit of random numbers
        int max = 999;
        int min = 0;
        int userAnswer;// store the math answer user inputs 
        Random randomNumbers = new Random();//Create a Random class object
        int randNumber1;
        int randNumber2;
        //let biggerNum be the bigger random number, and smallerNum be the smaller one
        int biggerNum,smallerNum;
        //user input choice 1-3 
        int choice = console.nextInt();

        do {
            if (choice != 3) { //enters as long as user input is not 3 (quitting)
                switch (choice) {
                    case 1: //user input is 1 
                        //generate 2 random numbers in the range [min,max]
                        randNumber1 = randomNumbers.nextInt((max - min) + 1) + min;
                        randNumber2 = randomNumbers.nextInt((max - min) + 1) + min;
                        //let biggerNum be the bigger random number, and smallerNum be the smaller one
                        if (randNumber1 > randNumber2) {
                            biggerNum = randNumber1;
                            smallerNum = randNumber2;
                        } else {
                            biggerNum = randNumber2;
                            smallerNum = randNumber1;
                        }
                        //display an addition for users to answer 
                        System.out.printf("%6d\n", biggerNum);
                        System.out.printf("+%5d\n", smallerNum);
                        System.out.println("-------");
                        System.out.print("   ");
                        userAnswer = console.nextInt();
                        //check answer 
                        if (userAnswer == biggerNum + smallerNum) {
                            System.out.println("Congrats! That's correct!");
                        } else {
                            System.out.printf("That's incorrect. "
                                    + "The correct answer is %d\n", biggerNum + smallerNum);

                        }
                        menu(); //display menu
                        choice = console.nextInt();//user input their choice again 
                        break;
                    case 2: //user input is 2 
                        //generate 2 random numbers in the range [min,max]
                        randNumber1 = randomNumbers.nextInt((max - min) + 1) + min;
                        randNumber2 = randomNumbers.nextInt((max - min) + 1) + min;
                        //let biggerNum be the bigger random number, and smallerNum be the smaller one
                        if (randNumber1 > randNumber2) {
                            biggerNum = randNumber1;
                            smallerNum = randNumber2;
                        } else {
                            biggerNum = randNumber2;
                            smallerNum = randNumber1;
                        }

                        //display a subtraction for users to answer
                        System.out.printf("%6d\n", biggerNum);
                        System.out.printf("-%5d\n", smallerNum);
                        System.out.println("-------");
                        System.out.print("   ");
                        userAnswer = console.nextInt();
                        //check answer 
                        if (userAnswer == biggerNum - smallerNum) {
                            System.out.println("Congrats! That's correct!");
                        } else {
                            System.out.printf("That's incorrect. "
                                    + "The correct answer is %d\n", biggerNum - smallerNum);
                        }
                        menu(); //display menu
                        choice = console.nextInt();//user input their choice again 
                        break;

                    default: //user entered a number that is not 1 or 2 

                        System.out.println("\nNo such choice in the menu!");
                        menu(); //display menu
                        choice = console.nextInt(); //prompts the user to enter again

                }

            } else { //choice = 3
                break;
            }
        } while (choice != 3); //the program repeats as long as user didn't enter 3

    }//end of doMath()

}//end of class
