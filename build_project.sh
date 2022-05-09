#!/bin/bash

cd bnf
rm -r hardtyped
bnfc --java --antlr ./hardtyped.cf
cd ..
mvn clean install