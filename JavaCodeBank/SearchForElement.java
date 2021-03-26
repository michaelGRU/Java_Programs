
/**
 *
 * @author michaelGRU
 *
 */
public class SearchForElement {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //say the number we want to find is 5
        int value = 7;
        System.out.println(findElement(numbers,value));
    }

    public static String findElement(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return "found it";
            }

        }
        return "not found";
    }

}
