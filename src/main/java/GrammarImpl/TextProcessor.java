package GrammarImpl;

import org.ahocorasick.trie.Token;
import org.ahocorasick.trie.Trie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private static Logger logger = LoggerFactory.getLogger(TextProcessor.class);

    public static ArrayList <Integer> countWordsInLine(String s) {
        ArrayList <Integer> line = new ArrayList <> ( );
        int wordCount = 0;
        int charCount = 0;
        boolean word = false;
        int endOfLine = s.length ( ) - 1;
        char temp;

        for (int i = 0; i < s.length ( ); i++) {
            // if the char is a letter, word = true.
            temp = s.charAt (i);
            if (Character.isLetter (temp) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter (temp) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter (temp) && i == endOfLine) {
                wordCount++;
            }

            if (temp != ' ') {
                charCount++;
            }
        }
        line.add (wordCount);
        line.add (charCount);
        return line;
    }

    public static ArrayList <String> findWord(String word, List <String> text) {
        ArrayList <String> wordOccurence = new ArrayList <> ( );
        Integer wordRepetition = 0;
        String textToBeSearch = "(?<=^|\\s)" + word + "(?=[\\s.,:;'\"!?)]|$)";
        Pattern pattern = Pattern.compile ((textToBeSearch));
        for (int i = 0; i < text.size ( ); i++) {
            Matcher matcher = pattern.matcher (text.get (i));
            while (matcher.find ( )) {
                wordRepetition++;
                wordOccurence.add ("Line: " + (i + 1) + "  Limits: [" + matcher.start ( ) + " , " + matcher.end ( ) + " ]");
            }
        }
        if (wordOccurence == null) {
            System.out.println (" Word : " + word + ", was NOT FOUND");

        }
        System.out.println ("Word Repetition " + wordRepetition);
        for (String line :
                wordOccurence) {
            System.out.println (line);
        }
        return wordOccurence;
    }

    public static String replace(String text, String initialState, String finalSate) {
        Trie trie = Trie.builder ( ).ignoreCase ( ).addKeyword (String.valueOf (initialState)).build ( );
        Collection <Token> tokens = trie.tokenize (text);
        Integer count = 0;
        for (Token token : tokens) {
            if (token.isMatch ( )) {
                text = text.replace (token.getFragment ( ), finalSate);
                count++;
            }
        }
        logger.info ("Number of replacement : " + count);
        return text;
    }
}
