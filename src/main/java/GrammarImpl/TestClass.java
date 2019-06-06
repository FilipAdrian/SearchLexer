package GrammarImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
    public static void main(String[] args) {
        String readFileAsString = FileManager.readFileAsString (".\\src\\main\\resources\\TextFile.txt");

//       readFileAsString = TextProcessor.replace (readFileAsString,"word","NewWord");
//        System.out.println (readFileAsString );
//        FileManager.writeInFile (".\\src\\main\\resources\\NewTextFile.txt",readFileAsString);
        String candidate = "applying a pattern.";

        String regex = "\\b(\\w+(?:language))\\b";
        Pattern p = Pattern.compile (regex,Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher (readFileAsString);
        String val = null;

        System.out.println ("INPUT: " + candidate);

        System.out.println ("REGEX: " + regex + "\r\n");

        while (m.find ( )) {
            val = m.group ( );
            System.out.println ("MATCH: " + val);
        }
        if (val == null) {
            System.out.println ("NO MATCHES: ");
        }


    }
}
