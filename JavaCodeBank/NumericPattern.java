    /**
     * @author michaelGRU
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