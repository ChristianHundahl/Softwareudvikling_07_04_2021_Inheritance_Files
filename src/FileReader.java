import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Class with methods exemplifying the concepts used in reading files
public class FileReader {
    //Exercise 3
    //Write a program that reads a file with n number of strings separated by line
    //breaks. The program determines and prints how many words are in the file.
    public static void readFile () throws FileNotFoundException{ //Circumvents inbuilt failsafe by throwing FileNoteFoundException
        File textToBeRead = new File("Filer/tekst");
        ArrayList<String> howManyWords = new ArrayList<>(); //List for words in file
        Scanner scan1 = new Scanner(textToBeRead); //Create scanner to read file
        while (scan1.hasNext()){ //Loop through file using scanner
            String currentWord = scan1.next(); //We store the value of the next token in a String called currentWord
            //howManyWords.add(currentWord);
            try {
                Integer.parseInt(currentWord);//Parse through individual words for Integers, separating numbers from words
            }
            catch (NumberFormatException e) {
                howManyWords.add(currentWord);//Add each instance of currentWord to Arraylist
            }
        }
        System.out.println("Der er " + howManyWords.size() + " ord i denne fil."); //Print number of words by printing size of Arraylist
    }
}