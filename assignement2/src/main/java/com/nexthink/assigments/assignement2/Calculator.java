package com.nexthink.assigments.assignement2;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.nexthink.assignements.calculator.ExprLexer;
import com.nexthink.assignements.calculator.ExprParser;



public class Calculator {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.calculate("((10-5)*5)+(21/7)")); // 7.0
		System.out.println(calculator.calculate("(5-3)*(4+5)")); // 2.0
	}

	public Integer calculate(String source) {
		CodePointCharStream input = CharStreams.fromString(source);
		ParseTree ptree = compile(input);
		ExprVisitorImpl visitor = new ExprVisitorImpl();
		return visitor.visit(ptree.getChild(0));
	}

	private ParseTree compile(CharStream source) {
		ExprLexer lexer = new ExprLexer(source);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokenStream);
		parser.addErrorListener(ThrowingErrorListener.INSTANCE);
		ParseTree tree = parser.prog();
		
		return tree;
	}
}