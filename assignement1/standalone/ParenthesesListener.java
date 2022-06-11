// Generated from Parentheses.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParenthesesParser}.
 */
public interface ParenthesesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParenthesesParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ParenthesesParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParenthesesParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ParenthesesParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParenthesesParser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(ParenthesesParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParenthesesParser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(ParenthesesParser.ParContext ctx);
}