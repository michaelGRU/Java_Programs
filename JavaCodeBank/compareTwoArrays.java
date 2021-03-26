/**
 *
 * @author michaelGRU
 *
 */
public class compareTwoArrays {
    public static void main(String[] args){
       int[] arrayA = {1,2,3,4};
       int[] arrayB = {1,2,3};
        System.out.println(compareArrays(arrayA, arrayB));
    } 
    public static boolean compareArrays(int[] arrayA, int[] arrayB){
        boolean arraysEqual = true;
        int i = 0;
        if (arrayA.length != arrayB.length){
            arraysEqual = false;
            return arraysEqual;
        }
        while (arraysEqual && i<arrayA.length){
            if(arrayA[i] != arrayB[i]){
                arraysEqual = false;
                return arraysEqual;
            }
            i++;
        }
        return true;
}
    

}
