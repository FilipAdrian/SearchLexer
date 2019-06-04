package GrammarImpl;

import Antlr.GrammarBaseVisitor;
import Antlr.GrammarParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class GrammarBaseVisitorImpl extends GrammarBaseVisitor <String> {
    private static Logger logger = LoggerFactory.getLogger (GrammarBaseVisitorImpl.class);

    private String filePath;
    private List <String> textFromFile;

    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx) {
//        System.out.println (ctx.getText ( ));
        return super.visitProgram (ctx);
    }

    @Override
    public String visitStatement(GrammarParser.StatementContext ctx) {
        return super.visitStatement (ctx);
    }

    @Override
    public String visitFilePathDeclaration(GrammarParser.FilePathDeclarationContext ctx) {
        filePath = ctx.getChild (3).toString ( );
        textFromFile = FileManager.readFile (filePath);
        return super.visitFilePathDeclaration (ctx);
    }

    @Override
    public String visitFindFunction(GrammarParser.FindFunctionContext ctx) {
        String word = ctx.getChild (2).toString ();
        TextProcessor.findWord (word,textFromFile);
        return super.visitFindFunction (ctx);
    }

    @Override
    public String visitReplaceFunction(GrammarParser.ReplaceFunctionContext ctx) {
        String text = FileManager.readFileAsString (filePath);
        String initialState = ctx.getChild (2).toString ();
        String finalState = ctx.getChild (4).toString ();
        text = TextProcessor.replace (text,initialState,finalState);
        FileManager.writeInFile (filePath,text);
        return super.visitReplaceFunction (ctx);
    }

    @Override
    public String visitLookFunction(GrammarParser.LookFunctionContext ctx) {
        System.out.println (ctx.getText ( ));
        return super.visitLookFunction (ctx);
    }

    @Override
    public String visitCountFunction(GrammarParser.CountFunctionContext ctx) {
        Integer wordNumber = 0 ;
        Integer charCount = 0;
        for(String line : textFromFile){
            wordNumber += TextProcessor.countWordsInLine (line).get (0);
            charCount += TextProcessor.countWordsInLine (line).get (1);
        }
        System.out.println ("Words = " + wordNumber);
        System.out.println ("Characters = " + charCount);
        return super.visitCountFunction (ctx);
    }

    @Override
    public String visitFindLineFunction(GrammarParser.FindLineFunctionContext ctx) {

        String functName = ctx.getChild (0).getText ( );
        String context = ctx.getChild (2).getText ( );
        if (functName.equals ("findLine")) {
            Integer lineNumber = Integer.parseInt (context);
            System.out.println (textFromFile.get (lineNumber-1));
        }
        return super.visitFindLineFunction (ctx);
    }

    @Override
    public String visitSpecial_symbol(GrammarParser.Special_symbolContext ctx) {
        System.out.println (ctx.getText ( ));
        return super.visitSpecial_symbol (ctx);
    }
}
