import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    //Exercise 3
    //Write a program that reads a file with n number of strings separated by line
    //breaks. The program determines and prints how many words are in the file.
    public static void readFile () throws FileNotFoundException{ //Circumvent inbuilt failsafe by throwing FileNoteFoundException
        File textToBeRead = new File("Filer/tekst");
        ArrayList<String> howManyWords = new ArrayList<>(); //List for words in file
        Scanner scan1 = new Scanner(textToBeRead); //Create scanner to read file
        while (scan1.hasNext()){ //Loop through file using scanner
            String currentWord = scan1.next(); //We store the value of the next token in a String called currentWord
            try {
                Integer.parseInt(currentWord);
            }
            catch (NumberFormatException e) {
                howManyWords.add(currentWord);//Add each instance of currentWord to Arraylist
            }
        }
        System.out.println("There are " + howManyWords.size() + " words in this file."); //Print number of words by printing size of Arraylist
    }

}
