package GrammarImpl;

import Antlr.GrammarLexer;
import Antlr.GrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GrammarCompiler {
    private static Logger logger = LoggerFactory.getLogger(GrammarCompiler.class);
    public void compile(String expresion) {
        CharStream stream = CharStreams.fromString (expresion);
        GrammarLexer lexer = new GrammarLexer (stream);

        try {
            CommonTokenStream tokenStream = new CommonTokenStream (lexer);
            GrammarParser parser = new GrammarParser (tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
            ParseTree tree = parser.program ();
            GrammarBaseVisitorImpl visitor = new GrammarBaseVisitorImpl ();
            String answer = visitor.visit (tree);
        }catch (ParseCancellationException e){
            logger.error (e.getMessage ());
        }


    }
}