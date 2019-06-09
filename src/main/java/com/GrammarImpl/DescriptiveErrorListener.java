
package com.GrammarImpl;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class DescriptiveErrorListener extends BaseErrorListener {

    public static final DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener ( );

    @Override
    public void syntaxError(Recognizer <?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        String error = "line " + line + ":" + charPositionInLine + " " + msg;
        throw new ParseCancellationException (error);
    }
}