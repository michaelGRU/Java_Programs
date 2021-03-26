
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author michaelGRU 
 * The program compares two text files, and calculates the
 * similarity between the vocabulary used. The algorithm is modified and build
 * upon a case study program written by Stuart Reges and Marty Stepp at the
 * University of Washington.
 */
public class TextComparison {

    public static void main(String[] args) {

        intro();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the first file: ");
        String firstFileName = keyboard.nextLine().trim();
        System.out.print("Enter the name of the second file: ");
        String secondFileName = keyboard.nextLine().trim();

        System.out.println("----------Statistics----------");

        printInitialAnalysis(firstFileName);
        printInitialAnalysis(secondFileName);

        ArrayList<String> text1 = scanEverything(firstFileName);
        ArrayList<String> text2 = scanEverything(secondFileName);
        ArrayList<String> uniqueWords1 = getUniqueWords(text1);
        ArrayList<String> uniqueWords2 = getUniqueWords(text2);
        ArrayList<String> commonWords = getCommonWords(uniqueWords1, uniqueWords2);
        System.out.println("The two files share " + commonWords.size() + " words in common\n");

        printFurtherAnalysis(text1, uniqueWords1, commonWords, firstFileName);
        printFurtherAnalysis(text2, uniqueWords2, commonWords, secondFileName);
        System.out.println("\n----------Interpretation----------");
        interpretation();
    }

    public static void intro() {
        System.out.println("The program compares two text files with large");
        System.out.println("data and calculates the similarity between");
        System.out.println("the vocabulary used based on word count,");
        System.out.println("unique words used, and common words");
        System.out.println("used in both files. The analysis is not suitable");
        System.out.println("for small data sets\n");
    }
    
    public static void interpretation(){
        System.out.println("A higher vocabulary diversity score indicates");
        System.out.println("a more diverse range of vocabulary that is being");
        System.out.println("used by the author, given that the total word");
        System.out.println("count is sufficiently large.\n");
        System.out.println("Common word rate indicates the percentage of");
        System.out.println("common words. A higher rate indicates a large");
        System.out.println("proportion of the words from another file appear");
        System.out.println("in this file\n");
        
        System.out.println("----------previous tests----------");
        System.out.println("We compared Macbeth and Romeo & Juliet");
        System.out.println("Macbeth has a vocabulary diversity score of 27.21, ");
        System.out.println("while Romeo and Juliet has a diversity score of 22.79 (+-5)");
        System.out.println("The common word rate for Macbeth is 35.21, and 30.66 (+-5)");
        System.out.println("for Romeo and Juliet");
        System.out.println("The numbers strongly indicate the two play is");
        System.out.println("written by the same author given the similaries between");
        System.out.println("the two results.\n");
        System.out.println("We then compared Casino Royale written by Ian Fleming");
        System.out.println("and Macbeth. The vocabulary diversity score is");
        System.out.println("27.21 and 17.6 (+-10) respectively. The common word rate");
        System.out.println("is 28.29 and 15.85 (+-13) respectively. The analysis shows");
        System.out.println("that Casino Royale has a much larger range of vocabularies.");
  
        
        
    }
    

    /**
     * An analysis on the file based on the number of unique words, common words
     * and total word count.
     *
     * @param text
     * @param uniqueWords
     * @param commonWords
     * @param fileName
     */
    public static void printFurtherAnalysis(ArrayList<String> text,
            ArrayList<String> uniqueWords, ArrayList<String> commonWords, String fileName) {
        double vocabDiversity = uniqueWords.size() * 100.0 / text.size();
        double commonWordRate = commonWords.size() * 100.0 / uniqueWords.size();
        System.out.printf("\nVocabulary diversity score is %.2f" + " for " + fileName, vocabDiversity);
        System.out.printf("\nCommon word rate is %.2f for " + fileName + "\n", commonWordRate);
        
    }

    /**
     * The method prints out number of words in the file, and number of unique
     * words.
     *
     * @param fileName
     */
    public static void printInitialAnalysis(String fileName) {
        try {
            Scanner scan1 = new Scanner(new File(fileName));
            ArrayList<String> text1 = scanEverything(fileName);
            ArrayList<String> uniqueWords = getUniqueWords(text1);
            if (text1.isEmpty()) {
                System.out.println(fileName + " is empty");
                System.out.println();
            } else {
                System.out.println("There are " + text1.size() + " words in " + fileName);
                if (uniqueWords.size() == 1) {
                    System.out.println("There is 1 unique word in " + fileName);
                    System.out.println();
                } else {
                    System.out.println("There are " + uniqueWords.size() + " unique words in " + fileName);
                   
                    System.out.println();
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(TextComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param fileName
     * @return the original file in the form of an ArrayList
     */
    public static ArrayList<String> scanEverything(String fileName) {
        ArrayList<String> text = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File(fileName));
            while (scan.hasNext()) {
                String nextWord = scan.next().toUpperCase();
                text.add(nextWord);
            }
            Collections.sort(text);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
        return text;
    }

    /**
     *
     * @param list1 sorted unique words
     * @param list2 sorted unique words
     * @return an ArrayList of common words
     */
    public static ArrayList<String> getCommonWords(
            ArrayList<String> list1, ArrayList<String> list2) {

        ArrayList<String> commonWords = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            int diff = list1.get(i).compareTo(list2.get(j));
            if (list1.get(i).equals(list2.get(j))) {
                commonWords.add(list1.get(i));
                i++;
                j++;
            } else if (diff < 0) {
                i++;
            } else {
                j++;
            }
        }
        return commonWords;
    }

    /**
     *
     * @param list
     * @return an ArrayList of unique words
     */
    public static ArrayList<String> getUniqueWords(ArrayList<String> list) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        if (list.isEmpty()) {
            return uniqueWords;
        }

        uniqueWords.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                uniqueWords.add(list.get(i));
            }
        }

        return uniqueWords;
    }

}
