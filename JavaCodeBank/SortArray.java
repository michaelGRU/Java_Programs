/**
 *
 * @author michaelGRU
 * The method returns false if the array is not sorted 
 * {1} returns true
 * {1,1} returns true
 * {1,2,3,30,100} returns true 
 * {1,5,2} returns false 
 */
public class SortArray {
      public static void main(String[] args) {
        
        int[] num = {1, 2, 3};
          System.out.println(isSorted(num));
          
          int[] num2 = {1,5,2};
          System.out.println(isSorted(num2));
        
    }

    /**
     * The method takes an array of integers as a parameter and returns true if
     * the array is sorted in ascending order and false if it is not
     *
     * @param numbers an array of integers
     * @return true if the boolean is sorted correctly in ascending order
     * @throws IllegalArgumentException when the array is empty
     */
    public static boolean isSorted(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is Empty");
        } else {
            //compare each index to its neighboring element 
            // we only need i til length-1 since we dont need 
            //to check the last elemente to its successor, which
            //would give an out of bound error. 
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    return false;
                }
            }
            return true;
        }

    }
    

}
