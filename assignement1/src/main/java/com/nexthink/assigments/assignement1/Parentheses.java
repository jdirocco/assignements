package com.nexthink.assigments.assignement1;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import com.nexthink.assignements.parentheses.ParenthesesLexer;
import com.nexthink.assignements.parentheses.ParenthesesParser;

public class Parentheses {

	public static boolean validate(String source) {
		CodePointCharStream input = CharStreams.fromString(source);
		try {
			compile(input);
			return true;
		} catch (ParseCancellationException e) {
			return false;
		}

	}

	private static ParseTree compile(CharStream source) {
		ParenthesesLexer lexer = new ParenthesesLexer(source);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		ParenthesesParser parser = new ParenthesesParser(tokenStream);
		parser.isMatchedEOF();
		parser.addErrorListener(ThrowingErrorListener.INSTANCE);
		ParseTree tree = parser.prog();

		return tree;
	}
}