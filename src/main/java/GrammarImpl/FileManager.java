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
        logger.info ("Text was read successfully");
        }

        return text;
    }

    public static String readFileAsString(String filePath) {
        String data = "";
        try {
            data = new String (Files.readAllBytes (Paths.get (filePath)));
        } catch (IOException e) {
            e.printStackTrace ( );
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
            logger.error ("File Not Found \t" + e.getMessage ( ));
        }
        return list;
    }

    public static int writeInFile(String path, String text) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter (new FileWriter (path));
            writer.write (text);
        }
        catch (IOException e) {
            logger.error ("Write in file failed \t" + e.getMessage () );
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
