# Parentheses balance
The projects uses ANTLR4 to parse the text and calculate the value.

## Compile
```mvn clean install```

The command compiles, packages and install the maven artifac.
It runs the tests and generates the grammar java API.
## Test
```mvn test```

The command runs the test cases.
## Generate Java classes form grammar
```mvn generate-sources```

The command generates the grammar java APIs.
## Run calculator by command line
```mvn compile exec:java -Dexec.mainClass="com.nexthink.assigments.assignement1.Runner" -Dexec.args="-expression '(())'"```

This command runs the calculator and takes the expression from the command line
