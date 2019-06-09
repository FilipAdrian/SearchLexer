package GrammarImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println ("\t PROGRAM EXECUTION ... ");
        String programCode = FileManager.readFileAsString (args[0]);
        GrammarCompiler compiler = new GrammarCompiler ( );
        try {
            compiler.compile (programCode);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return;
    }



}
