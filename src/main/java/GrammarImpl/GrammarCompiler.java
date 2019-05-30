package GrammarImpl;

import Antlr.GrammarLexer;
import Antlr.GrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class GrammarCompiler {
    public void compile(String expresion) {
        CharStream stream = CharStreams.fromString (expresion);
        GrammarLexer lexer = new GrammarLexer (stream);
        CommonTokenStream tokenStream = new CommonTokenStream (lexer);
        GrammarParser parser = new GrammarParser (tokenStream);
        parser.setErrorHandler(new BailErrorStrategy ());
        ParseTree tree = parser.program ();
        GrammarBaseVisitorImpl visitor = new GrammarBaseVisitorImpl ();
        String answer = visitor.visit (tree);
        if (answer != null){
            System.out.println (answer );
            System.out.println ("Ura !!!" );

        }
        else {
            System.out.println ("\n Something is wrong in expresion" );
        }
    }
}
