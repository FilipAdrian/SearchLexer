package GrammarImpl;

import Antlr.GrammarBaseVisitor;
import Antlr.GrammarParser;

import java.util.List;

public class GrammarBaseVisitorImpl extends GrammarBaseVisitor <String> {

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
        textFromFile = TextProcessor.readFile (filePath);
        return super.visitFilePathDeclaration (ctx);
    }

    @Override
    public String visitStandardFunction(GrammarParser.StandardFunctionContext ctx) {
        return super.visitStandardFunction (ctx);
    }

    @Override
    public String visitReplaceFunction(GrammarParser.ReplaceFunctionContext ctx) {
        System.out.println (ctx.getText ( ));
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
    public String visitStandard_func_name(GrammarParser.Standard_func_nameContext ctx) {
        return super.visitStandard_func_name (ctx);
    }

    @Override
    public String visitSpecial_symbol(GrammarParser.Special_symbolContext ctx) {
        System.out.println (ctx.getText ( ));
        return super.visitSpecial_symbol (ctx);
    }
}