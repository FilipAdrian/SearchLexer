package GrammarImpl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextProcessor {

    public static List <String> readFile(String filePath) {
        File file = new File (filePath);
        Scanner sc = null;
        List <String> text = new LinkedList <> ( );
        text = bufferReaderToList (filePath, new LinkedList <> ( ));
        System.out.println ("Text was read successfully");
        return text;
    }

    private static List <String> bufferReaderToList(String path, List <String> list) {
        BufferedReader reader;
        try {
            reader = new BufferedReader (new FileReader (path));
            String line = reader.readLine ( );
            while (line != null) {
                list.add (line);
                line = reader.readLine ( );
            }
            reader.close ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        return list;
    }


    public static ArrayList<Integer> countWordsInLine(String s){
        ArrayList<Integer> line = new ArrayList <> ();
        int wordCount = 0;
        int charCount = 0;
        boolean word = false;
        int endOfLine = s.length() - 1;
        char temp;

        for (int i = 0; i < s.length(); i++) {
            // if the char is a letter, word = true.
            temp = s.charAt(i);
            if (Character.isLetter(temp) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(temp) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(temp) && i == endOfLine) {
                wordCount++;
            }

            if(temp != ' '){
                charCount ++;
            }
        }
        line.add (wordCount);
        line.add (charCount);
        return line;
    }
}
