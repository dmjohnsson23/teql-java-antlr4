package me.dmjohnson.teql;

import me.dmjohnson.teql.lang.TeqlLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) {
        CharStream inputStream = CharStreams.fromString(
            "FIRST 5 \"beans\" BETWEEN /this/ and /that/"
        );
        TeqlLexer lexer = new TeqlLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        tokens.consume();
        System.out.println(tokens.getTokens());
    }
}
