# Calculator
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
```mvn compile exec:java -Dexec.mainClass="com.nexthink.assigments.assignement2.Runner" -Dexec.args="-expression '((10 - 5 ) *5) + (21 / 7)'"```

This command run the calculator and takes the expression from the command line

## Expression binary tree
![](standalone/antlr4_parse_tree.png)

The picture above has been generated from the code generated from the ```Expr``` grammar.
