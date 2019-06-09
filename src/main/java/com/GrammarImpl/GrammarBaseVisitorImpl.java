package com.GrammarImpl;

import Antlr.GrammarBaseVisitor;
import Antlr.GrammarParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
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
        filePath = ctx.getChild (3).getText ( );
        textFromFile = FileManager.readFile (filePath);
        return super.visitFilePathDeclaration (ctx);
    }

    @Override
    public String visitFindFunction(GrammarParser.FindFunctionContext ctx) {
        String function = ctx.getChild (0).getText ( );
        String word = ctx.getChild (2).getText ( );
        ArrayList <String> lineWithAllMatchedWords;
        switch (function) {
            case "find":
                TextProcessor.findWord (word, textFromFile);
                break;
            case "find.byPrefix":
                lineWithAllMatchedWords = TextProcessor.findByInText ("prefix", textFromFile, word);
                if (lineWithAllMatchedWords != null) {
                    for (String line : lineWithAllMatchedWords) {
                        System.out.println (line);
                    }
                }
                break;
            case "find.bySuffix":
                lineWithAllMatchedWords = TextProcessor.findByInText ("suffix", textFromFile, word);
                if (lineWithAllMatchedWords != null) {
                    for (String line : lineWithAllMatchedWords) {
                        System.out.println (line);
                    }
                }
                break;
            case "find.byFragment":
                ArrayList <String> matches = TextProcessor.findByFragment (word, textFromFile);
                for (String match : matches) {
                    System.out.println (match);
                }
                break;


        }
        return super.visitFindFunction (ctx);
    }

    @Override
    public String visitReplaceFunction(GrammarParser.ReplaceFunctionContext ctx) {

        String text = FileManager.readFileAsString (filePath);
        String initialState = ctx.getChild (2).getText ( );
        String finalState = ctx.getChild (4).getText ( );
        text = TextProcessor.replace (text, initialState, finalState);
        FileManager.writeInFile (filePath, text);
        return super.visitReplaceFunction (ctx);
    }

    @Override
    public String visitChangeFormat(GrammarParser.ChangeFormatContext ctx) {
        logger.info ("CHANGE FORMAT PROCESSING ...");
        String text = FileManager.readFileAsString (filePath);
        String changeType = ctx.getChild (0).getText ( );
        String initialState = getParameters (ctx).get (0);
        String finalState = getParameters (ctx).get (1);

        switch (changeType) {
            case "change.numberFormat": {
                String newText = FormatModification.changeNumberFormat (text, initialState, finalState);
                if ( newText != null) {
                    FileManager.writeInFile (filePath, newText);

                }
                break;
            }
            case "change.dateFormat": {
                String newText = FormatModification.changeDateFormat (text, initialState, finalState);
                if (newText != null) {
                    FileManager.writeInFile (filePath, newText);

                }
                break;
            }
        }
        return super.visitChangeFormat (ctx);
    }

    private static ArrayList <String> getParameters(GrammarParser.ChangeFormatContext ctx) {
        String initialState = "";
        String finalState = "";
        ArrayList <String> parameters = new ArrayList <> ( );
        boolean comma = false;
        for (int i = 2; i < ctx.getChildCount ( ) - 2; i++) {
            if (!comma && !ctx.getChild (i).getText ( ).equals (",")) {
                initialState += ctx.getChild (i).getText ( );
            } else if (ctx.getChild (i).getText ( ).equals (",")) {
                comma = true;
            } else {
                finalState += ctx.getChild (i).getText ( );
            }
        }
        parameters.add (initialState);
        parameters.add (finalState);
        return parameters;

    }

    @Override
    public String visitLookFunction(GrammarParser.LookFunctionContext ctx) {
        String function = ctx.getChild (0).getText ( );
        switch (function) {
            case "lookFor": {
                String word = "";
                for (GrammarParser.ExprContext expr : ctx.expr ( )) {
                    word += expr.getText ( );
                }
                ArrayList <String> matches = TextProcessor.lookFor (word, textFromFile);
                for (String match : matches) {
                    System.out.println (match);
                }
                break;
            }
            case "lookFor.format": {
                try {
                    String expresion = "";
                    for (GrammarParser.ExprContext exp : ctx.expr ( )) {
                        expresion += exp.getText ( );
                    }
                    String regex = FormatModification.findFormat (expresion);
                    ArrayList <String> matches = TextProcessor.lookFor (regex, textFromFile);
                    if (matches.isEmpty ( )) {
                        throw new NullPointerException ( );
                    }
                    for (String match : matches) {
                        System.out.println (match);
                    }
                } catch (NullPointerException e) {
                    logger.error ("NO ANY COINCIDENCE FOR THAT FORMAT");
                }
                break;

            }

        }

        return super.visitLookFunction (ctx);
    }

    @Override
    public String visitCountFunction(GrammarParser.CountFunctionContext ctx) {
        logger.info (" COUNT WORD PROCESSING ... ");
        Integer wordNumber = 0;
        Integer charCount = 0;
        for (String line : textFromFile) {
            wordNumber += TextProcessor.countWordsInLine (line).get (0);
            charCount += TextProcessor.countWordsInLine (line).get (1);
        }
        System.out.println ("Words = " + wordNumber);
        System.out.println ("Characters = " + charCount);
        return super.visitCountFunction (ctx);
    }

    @Override
    public String visitFindLineFunction(GrammarParser.FindLineFunctionContext ctx) {
        logger.info (" FIND LINE PROCESSING ... ");
        String context = ctx.getChild (2).getText ( );
        Integer lineNumber = Integer.parseInt (context);
        try {
            if (lineNumber > textFromFile.size ( )) {
                throw new IndexOutOfBoundsException ("LINE WITH SUCH NUMBER DOES NOT EXISTS");
            }
            System.out.println (textFromFile.get (lineNumber - 1));
        } catch (IndexOutOfBoundsException e) {
            logger.error (e.getMessage ( ));
        }
        return super.visitFindLineFunction (ctx);
    }


}
