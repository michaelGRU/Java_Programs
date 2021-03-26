
import java.util.Arrays;

/**
 *
 * @author michaelGRU
 *
 * Given two sorted arrays, A and B Merge the two arrays without using
 * additional data structure
 *
 */
public class mergeSortedArrays {

    public static void main(String[] args) {

        int[] a = {1,4,9};
        int[] b = {2,3,5,8,12};
        int[] c = new int[a.length + b.length];

        //method 1
        //track indices of a, b and c
        int i = 0; //track a 
        int j = 0; //track b
        int k = 0; //track c

        while (i < a.length && j < b.length) {
            c[k++] = a[i] > b[j] ? b[j++] : a[i++];

        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(merge(a,b)));

    }
 
    public static int[] merge(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = a.length - 1, j = b.length - 1, k = answer.length;

        while (k > 0) {
            answer[--k]
                    = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
        }
        return answer;
    }

}
