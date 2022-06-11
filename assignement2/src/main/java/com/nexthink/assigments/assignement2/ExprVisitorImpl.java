package com.nexthink.assigments.assignement2;

import com.nexthink.assignements.calculator.ExprBaseVisitor;
import com.nexthink.assignements.calculator.ExprParser;
import com.nexthink.assignements.calculator.ExprParser.ExprContext;

public class ExprVisitorImpl extends ExprBaseVisitor<Integer> {

	@Override
	public Integer visitExpr(ExprParser.ExprContext ctx) {
		if (ctx.INT() != null)
			return Integer.parseInt(ctx.INT().getText());
		if (ctx.getChild(1) != null && (ctx.getChild(1).getText().equals("+") || ctx.getChild(1).getText().equals("-")
				|| ctx.getChild(1).getText().equals("*") || ctx.getChild(1).getText().equals("/"))) {
			String operator = ctx.getChild(1).getText();
			int left = visitExpr((ExprContext) ctx.getChild(0));
			int right = visitExpr((ExprContext) ctx.getChild(2));
			switch (operator) {
			case "+":
				return left + right;
			case "-":
				return left - right;
			case "/":
				return left / right;
			case "*":
				return left * right;
			default:
				throw new UnsupportedOperationException("Calculator does not support " + operator);
			}
		}
		if(ctx.getChild(0).getText().startsWith("("))
			return visitExpr((ExprContext) ctx.getChild(1));

		return 0;
//    	if (ctx.getChild(0).getText().startsWith("("))
//    		return visit(ctx.getChild(0).getChild(1));
//        if (ctx.getChild(1) == null) {
//            throw new UnsupportedOperationException("An operator of +, -, /, * is required to perform the operation");
//        }
//        String operator = ctx.getChild(1).getText();
//        int left = Integer.parseInt(ctx.getChild(0).getText());
//        int right = Integer.parseInt(ctx.getChild(2).getText());
//
//        switch (operator) {
//            case "+":
//                return left + right;
//            case "-":
//                return left - right;
//            case "/":
//                return left / right;
//            case "*":
//                return left * right;
//            default:
//                throw new UnsupportedOperationException("Calculator does not support " + operator);
//        }
	}
}