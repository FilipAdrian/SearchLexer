package GrammarImpl;

import net.amygdalum.util.text.StringUtils;
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

    public static void findWord(String word, List <String> text) {
        logger.info (" FIND WORD PROCESSING ... ");
        ArrayList <String> wordOccurence = new ArrayList <> ( );
        Integer wordRepetition = 0;
        String textToBeSearch = "(?<=^|\\s)" + word + "(?=[\\s.,:;'\"!?)]|$)";
        Pattern pattern = Pattern.compile (textToBeSearch,Pattern.CASE_INSENSITIVE);
        for (int i = 0; i < text.size ( ); i++) {
            Matcher matcher = pattern.matcher (text.get (i));
            while (matcher.find ( )) {
                wordRepetition++;
                wordOccurence.add ("Line: " + (i + 1) + "  Limits: [" + matcher.start ( ) + " , " + matcher.end ( ) + " ]");
            }
        }
        if (wordRepetition == 0) {
            logger.warn (" WORD : " + word + ", WAS NOT FOUND");

        }else{
            logger.info ("NUMBER OF OCCURRENCES: " + wordRepetition);
        }
        for (String line :
                wordOccurence) {
            System.out.println (line);
        }

    }

    public static String replace(String text, String initialState, String finalSate) {
        logger.info (" REPLACE WORD PROCESSING ... ");
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
    private  static  HashMap<Integer,String> findByInLine(String type ,Integer lineNumber,String line, String word){
        HashMap<Integer,String> wordMatches = new HashMap <> ();
        String regex = null ;
        if (type.equals ("prefix")){
            regex = word+"\\w+";
        }else{
            regex = "\\b(\\w+(?:" + word + "))\\b";
        }
        Pattern p = Pattern.compile (regex,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher (line);
        String val = null;
        ArrayList<String> matches = new ArrayList <> ();
        Integer count = 0;
        while (m.find ( )) {
            val = m.group ( );
            matches.add (val);
            count ++;
        }
        if (val == null) {
            return null;
        }
        wordMatches.put (count,"Line "+lineNumber+" :"+StringUtils.join(matches, ","));


        return wordMatches;
    }

    public static ArrayList<String> findByInText(String type,List<String> textFromFile ,String word){
        logger.info (" FIND BY " + type.toUpperCase ()+" PROCESSING ... ");
        Integer count = 0;
        HashMap<Integer,String> wordMatches = null;
        ArrayList<String> lineWithAllMatchedWords = new ArrayList <> ();
        for (int i = 0; i <textFromFile.size () ; i++) {
            String line = textFromFile.get (i);
            wordMatches = findByInLine (type,i+1,line,word);
            if (wordMatches != null) {
                count += (Integer)wordMatches.keySet ( ).toArray ( )[0];
                lineWithAllMatchedWords.add ((String)wordMatches.values ().toArray ()[0]);
            }
        }
        if (count == 0){
            logger.warn ("NO WORD FOUND");
            return null;
        }else{
            logger.info("TOTAL NUMBER OF MATCHES: "+ count);
        }
        return  lineWithAllMatchedWords;
    }
}
