
/**
 *
 * @author michaelGRU
 *
 */

public class ArrayBasics {

    public static void main(String[] args) {
        //create an array of Strings
        String[] names = {"Dwight", "Kevin", "Pam", "Jim", "Michael"};

//********************************loop through array*****************************************   
        //Loop through Array 
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        //alternatively
        for (String i : names) {
            System.out.print(i + " ");
        }
        System.out.println();


}