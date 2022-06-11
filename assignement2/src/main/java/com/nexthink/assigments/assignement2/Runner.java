package com.nexthink.assigments.assignement2;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


public class Runner {

	public static void main(String[] args) {
		new Runner().run(args);		

	}

	public void run(String[] args) {
		HelpFormatter formatter = new HelpFormatter();

		Options opts = new Options()
				.addOption(Option.builder("expression").desc("expression to be evaluated").hasArg()
						.argName("expression").required().build());

		try {
			CommandLineParser parser = new DefaultParser();
			CommandLine cmd = parser.parse(opts, args);
			String expression = cmd.getOptionValue("expression");
			Integer value = Calculator.calculate(expression);
			System.out.println(String.format("The expression %s is equal to %d",expression, value));
			
			
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			formatter.printHelp("Calculator", opts);
		} 
	}

}
