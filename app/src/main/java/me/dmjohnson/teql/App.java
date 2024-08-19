package me.dmjohnson.teql;

import me.dmjohnson.teql.lang.TeqlLexer;
import me.dmjohnson.teql.lang.TeqlParser;
import me.dmjohnson.teql.lang.AstBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) {
        CharStream inputStream = CharStreams.fromString(
            "FIND / that/  "
        );
        TeqlLexer lexer = new TeqlLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TeqlParser parser = new TeqlParser(tokens);
        AstBuilder builder = new AstBuilder();
        System.out.println(builder.visit(parser.selector()));
    }
}
