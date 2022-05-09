package com.interpreter;

import hardtyped.Absyn.ListExpr;
import hardtyped.Test;


public class Main {

    public static void main(String args[]) throws Exception {

        for (String str: args) {
            System.out.println(str);
        }

        Test t = new Test(args);
        try
        {
            ListExpr ast = t.parse();
            System.out.println("Printing tree");
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
