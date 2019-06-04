package GrammarImpl;

public class TestClass {
    public static void main(String[] args) {
        String readFileAsString = FileManager.readFileAsString (".\\src\\main\\resources\\TextFile.txt");

       readFileAsString = TextProcessor.replace (readFileAsString,"word","NewWord");
        System.out.println (readFileAsString );
        FileManager.writeInFile (".\\src\\main\\resources\\NewTextFile.txt",readFileAsString);
    }
}
