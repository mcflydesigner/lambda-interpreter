#!/bin/bash

bnfc --java --antlr ./bnf/hardtyped.cf
mvn clean install