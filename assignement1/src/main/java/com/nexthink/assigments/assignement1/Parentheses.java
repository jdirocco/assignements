package com.nexthink.assigments.assignement1;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.nexthink.assignements.parentheses.ParenthesesLexer;
import com.nexthink.assignements.parentheses.ParenthesesParser;

public class Parentesis {

	public static void main(String[] args) {

		Parentesis calculator = new Parentesis();
		System.out.println(calculator.validate("(((44+5)")); // 7.0
		System.out.println(calculator.validate("()")); // 2.0
	}

	public boolean validate(String source) {
		CodePointCharStream input = CharStreams.fromString(source);

		ParseTree ptree = compile(input);
		return true;

	}

	private ParseTree compile(CharStream source) {
		ParenthesesLexer lexer = new ParenthesesLexer(source);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		ParenthesesParser parser = new ParenthesesParser(tokenStream);
		parser.isMatchedEOF();
		parser.addErrorListener(ThrowingErrorListener.INSTANCE);
		ParseTree tree = parser.prog();

		return tree;
	}
}