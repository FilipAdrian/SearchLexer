package GrammarImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    private static Logger logger = LoggerFactory.getLogger (FileManager.class);

    public static List <String> readFile(String filePath) {
        List <String> text = new LinkedList <> ( );

        File file = new File (filePath);
        Scanner sc = null;
        text = bufferReaderToList (filePath, new LinkedList <> ( ));
        if (!text.isEmpty ()){
        logger.info ("TEXT WAS READ SUCCESSFULLY ...");
        }

        return text;
    }

    public static String readFileAsString(String filePath) {
        String data = "";
        try {
            data = new String (Files.readAllBytes (Paths.get (filePath)));
        } catch (IOException e) {
           logger.error ("FILE WAS NOT FOUND");
        }
        return data;
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
            logger.error ("FILE NOT FUND \t" + e.getMessage ( ));
        }
        return list;
    }

    public static int writeInFile(String path, String text) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter (new FileWriter (path));
            writer.write (text);
            logger.info ("SUCCESSFUL REPLACEMENT");
        }
        catch (IOException e) {
            logger.error ("WRITE IN FILE FAILED \t" + e.getMessage () );
        } finally {
            try {
                writer.close ( );
            } catch (IOException e) {
                e.printStackTrace ( );
            }
        }
        return 0;
    }
}
