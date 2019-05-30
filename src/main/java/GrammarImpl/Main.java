package GrammarImpl;

import java.util.ArrayList;
import java.util.Scanner;
//Program Code
//Start
//path= "C:\Users\Adrian\Desktop\Antlr\TextFile.txt";
//findLine(6);
//findLine(27);
//count();
//End
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("\t Program Code ");
        String programCode = getUserProgram (scanner);
//        System.out.println (programCode );
        GrammarCompiler compiler = new GrammarCompiler ( );
        try {
            compiler.compile (programCode);
        } catch (Exception e) {
            System.out.println ("Insert correct program syntax");
            System.out.println (e.getMessage ( ));
        }
        scanner.close ( );
    }

    public static String getUserProgram(Scanner keyboard) {

        String input = new String ( );
        while (keyboard.hasNextLine ( )) {
            String line = keyboard.nextLine ( );
            if (line.contains ("End")) {
                input += line + "\n";
                break;
            } else if (!line.trim ( ).isEmpty ( )) {
                input += line + "\n";
            }
        }
        return input;
    }

}
