package me.dmjohnson.teql.lang;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AstBuilder extends TeqlParserBaseVisitor<String> {
    public String visitSelector(TeqlParser.SelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitParantheticalSelector(TeqlParser.ParantheticalSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitStartSelector(TeqlParser.StartSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitEndSelector(TeqlParser.EndSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitSeekSelector(TeqlParser.SeekSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitOffsetSelector(TeqlParser.OffsetSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitFindSelector(TeqlParser.FindSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitLineSelector(TeqlParser.LineSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitBeforeSelector(TeqlParser.BeforeSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitAfterSelector(TeqlParser.AfterSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitBetweenSelector(TeqlParser.BetweenSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitBlockSelector(TeqlParser.BlockSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitQualifiedSelector(TeqlParser.QualifiedSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitNestedSelector(TeqlParser.NestedSelectorContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitStringLiteral(TeqlParser.StringLiteralContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitStringLiteralInterpolation(TeqlParser.StringLiteralInterpolationContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteral(TeqlParser.RegexLiteralContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteralQualifier(TeqlParser.RegexLiteralQualifierContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteralQualifiedUnit(TeqlParser.RegexLiteralQualifiedUnitContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteralUnit(TeqlParser.RegexLiteralUnitContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteralLiteral(TeqlParser.RegexLiteralLiteralContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteralCharRange(TeqlParser.RegexLiteralCharRangeContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteralCharClass(TeqlParser.RegexLiteralCharClassContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRegexLiteral_group(TeqlParser.RegexLiteral_groupContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRangeLiteral(TeqlParser.RangeLiteralContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRangeLiteralUnit(TeqlParser.RangeLiteralUnitContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRangeLiteralRelrange(TeqlParser.RangeLiteralRelrangeContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRangeLiteralRange(TeqlParser.RangeLiteralRangeContext ctx){
        System.out.println(ctx);
        return null;
    }
    public String visitRangeLiteralLiteral(TeqlParser.RangeLiteralLiteralContext ctx){
        System.out.println(ctx);
        return null;
    }
}
