package com.interpreter.shared.libs.std;

public class StdLibDefinitions {

    public final static String PRINT_DEFINITION = """
            /\\ x: Any. {
                unit;
            };
            """;

    public final static String READ_INT = """
            /\\ x: Unit. {
                int;
            };
            """;

    public final static String READ_REAL = """
            /\\ x: Unit. {
                real;
            };
            """;

    public final static String READ_BOOL = """
            /\\ x: Unit. {
                bool;
            };
            """;


    public final static String READ_STRING = """
            /\\ x: Unit. {
                string;
            };
            """;

}
