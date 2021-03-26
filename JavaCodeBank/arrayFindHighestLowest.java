/**
 *
 * @author michaelGRU
 * Find the highest and the lowest element in a 1D array
 */
public class arrayFindHighestLowest {
    public static void main(String[] args){
      
        int[] numbers = {1,2,3,0,5};
        System.out.println(findHighest(numbers));
        System.out.println(findLowest(numbers));
        
        
    }
    
    /**
     * @param numbers an arbitrary 1-D array 
     * @return  the highest element in an 1D array 
     */
    public static int findHighest(int[] numbers){
        int highest = numbers[0];
        for(int element:numbers){
            if(element>highest){
                highest = element;
            }
        }
        return highest;
    }
    
     /**
     * @param numbers an arbitrary 1-D array 
     * @return  the lowest element in an 1D array 
     */
    public static int findLowest(int[] numbers){
        int lowest = numbers[0];
        for(int element:numbers){
            if(element<lowest){
                lowest = element;
            }
        }
        return lowest;
    }
    
    

}
