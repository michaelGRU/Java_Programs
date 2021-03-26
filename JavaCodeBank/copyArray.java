
import java.util.Arrays;

/**
 *
 * @author michaelGRU
 * 
 * Make a copy of an array of integers
 */
public class copyArray {
    
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = copyArray(a);
        System.out.println(Arrays.toString(b));
    }


    public static int[] copyArray(int[] nums){
        int[] copy = new int[nums.length];
        for(int i = 0; i< nums.length; i++){ 
            copy[i] = nums[i];
        } 
        return copy;
    }
}