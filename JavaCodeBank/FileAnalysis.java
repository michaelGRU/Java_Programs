 /**
  * @author michaelGRU
     * The method takes two file names, and analyzes a sequence of integers
     * stored in the first file and stores results of analysis in the second
     * file. The following statistics are calculated: 1. the number of integers
     * stored 2. the largest and the smallest number stored in the file 3. the
     * total of all numbers stored in the file
     *
     * @param inputFileName the name of the input file
     * @param outputFileName the name of the output file
     * @throws IOException when the files fail to open for reading and writing
     */
    public static void fileAnalysis(String inputFileName, String outputFileName) throws IOException {
        //stores the number of integers stored in the input file
        int count = 0;
        //stores the largest and smallest number in the input file
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        //stores the sum of all numers in the input file
        int sum = 0;
        //stores the value of a number in the input file
        int num;

        // Open the file. At this point an exception may be thrown
        Scanner scanInputFile = new Scanner(new File(inputFileName));

        // This loop processes the lines read from the file,
        // until the end of the file is encountered.
        while (scanInputFile.hasNext()) {

            // Read an int from the file.
            num = scanInputFile.nextInt();

            //find the largest and the smallest number
            largest = num > largest ? num : largest;
            smallest = num < smallest ? num : smallest;

            //find the total sum
            sum += num;
            //counting how many numbers are in the file
            count++;
        }

        scanInputFile.close();

        //use a PrintWriter object to print the analyzed data into another file
        PrintWriter printOutput = new PrintWriter(new File(outputFileName));

        switch (count) {
            case 1:
                //when there is only one number: sum = whatever the number is
                printOutput.println("Numeric data file \"" + inputFileName + "\" has only one number: " + sum);
                break;
            case 0:
                printOutput.println("Numeric data file \"" + inputFileName + "\" is empty");
                break;
            default: //regular case where the file we are reading has more than one num
                printOutput.println("Numeric Data File" + " \"" + inputFileName + "\"" + " Analysis");
                printOutput.println("Number of integers: " + count);
                printOutput.println("The sum of all integers in file: " + sum);
                printOutput.println("The largest integer in the set: " + largest);
                printOutput.println("The smallest integer in the set: " + smallest);
                break;
        }
        printOutput.close();
    }//end of method