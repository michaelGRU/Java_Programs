/**
 *
 * @author michaelGRU
 *
 */
public class arrayFindAverage {
    public static void main(String[] args){
      int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findAverage(numbers));
        System.out.println(findSum(numbers));
              
    }  
    /**
     * 
     * @param numbers an arbitrary 1-D array
     * @return the average of all the numbers inside the array 
     */
    public static double findAverage(int[] numbers){
        double sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        return sum/numbers.length;
        
    
    }
    
    
        /**
     * 
     * @param numbers an arbitrary 1-D array
     * @return the sum of all the numbers inside the array 
     */
    public static double findSum(int[] numbers){
        double sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        return sum;
        
    
    }
    

}
