#!/bin/bash

cd ./bnf
rm -r hardtyped
bnfc --java --antlr ./hardtyped.cf
bnfc --latex ./hardtyped.cf -o doc/
cd ./doc
latexmk -pdf ./hardtyped.tex
cd ../../
mvn clean install