  /**
   * @author michaelGRU
     * The static method manually convert a string into an int without using any
     * existing methods.
     *
     * @param str
     * @return the converted integer value
     */
    public static int parseInt(String str) {

        //save the final result in an int variable called result
        int result = 0;

        //The ascii code for 0 is 48 >> (int)'0' = 48
        //The ascii code for 1 is 49 >> (int)'1' = 49
        //(int)'1' - (int)'0' = 49 - 48 = 1, which is the int value for 1
        //So for instance, to convert  '7' to an int
        // we could do (int)'7' - (int)'0' = 7
        // Now we just need to go through each char of the string, 
        // and convert every single char to an int 
        //if '-', or the negative sign, is the very first character of the string
        // instead of summing up all of the terms, we keep subtracting the term from 0
        //this is the case where the string starts with a negative sign '-'
        if (str.charAt(0) == '-') {
            

            //check the case where there is only a negative sign entered 
            if (str.length() == 1) {
                throw new IllegalArgumentException("Invalid input. You entered a negative sign");

            }

            for (int i = 1; i < str.length(); i++) {

                //check if the string contains non-digit characters
                // the ascii code from 0 to 9 is from 48 to 57
                // if the character is not within this range and it's not a '-'
                //it must be an invalid non-digit chracter 
                if ((int) str.charAt(i) != 48 && (int) str.charAt(i) != 49
                        && (int) str.charAt(i) != 50 && (int) str.charAt(i) != 51
                        && (int) str.charAt(i) != 52 && (int) str.charAt(i) != 53
                        && (int) str.charAt(i) != 54 && (int) str.charAt(i) != 55
                        && (int) str.charAt(i) != 56 && (int) str.charAt(i) != 57) {
                    
                    
                    throw new IllegalArgumentException("The string contains non-digit characters");

                } else {

                    result *= 10; //move one digit to the left
                    result -= (int) str.charAt(i) - (int) '0';
                    //when the string underflows, it turns from -2147483648 to a positive number 
                    if(result > 0){
                        throw new IllegalArgumentException("Underflow. The number is too small");
                    }

                }
            }

            return result;

        } else {
           
            for (int i = 0; i < str.length(); i++) {

                //check if the string contains non-digit characters
                // the ascii code from 0 to 9 is from 48 to 57
                // if the character is not within this range and it's not a '-'
                //it must be an invalid non-digit chracter 
                if ((int) str.charAt(i) != 48 && (int) str.charAt(i) != 49
                        && (int) str.charAt(i) != 50 && (int) str.charAt(i) != 51
                        && (int) str.charAt(i) != 52 && (int) str.charAt(i) != 53
                        && (int) str.charAt(i) != 54 && (int) str.charAt(i) != 55
                        && (int) str.charAt(i) != 56 && (int) str.charAt(i) != 57) {
                    throw new IllegalArgumentException("The string contains non-digit characters");

                } else {

                    result *= 10; //move one digit to the left
                    result += (int) str.charAt(i) - (int) '0';
                    //when the string overflows, it turns from 2147483647 to a negative number 
                    if(result < 0){
                        throw new IllegalArgumentException("Overflow. The number is too big");
                    }
                   
                }
            }

            return result;

        }//end of else 

    }//end of method