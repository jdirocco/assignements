#!/bin/bash -i

export CLASSPATH=".:./antlr-4.10.1-complete.jar:$CLASSPATH"#
alias antlr4='java -jar antlr-4.10.1-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
