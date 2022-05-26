package com.interpreter.shared.libs.std;

public class StdLibDefinitions {

    public final static String PRINT_DEFINITION = """
            /\\ x: Any. {
                unit;
            };
            """;

    public final static String READ_INT = """
            /\\ x: Unit. {
                1;
            };
            """;

    public final static String READ_REAL = """
            /\\ x: Unit. {
                0.0;
            };
            """;

    public final static String READ_BOOL = """
            /\\ x: Unit. {
                true;
            };
            """;


    public final static String READ_STRING = """
            /\\ x: Unit. {
                "string";
            };
            """;

    public final static String INT_TO_REAL = """
            /\\ x: Int. {
                1.0;
            };
            """;

    public final static String INT_TO_STRING = """
            /\\ x: Int. {
                "string";
            };
            """;

    public final static String REAL_TO_INT = """
            /\\ x: Real. {
                1;
            };
            """;

    public final static String REAL_TO_STRING = """
            /\\ x: Real. {
                "string";
            };
            """;

    public final static String STRING_TO_REAL = """
            /\\ x: String. {
                1.0;
            };
            """;

    public final static String STRING_TO_INT = """
            /\\ x: String. {
                1;
            };
            """;

}
