package functions;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestFunctions {

    private static String pathToTests = "tests/functions/";

    @Test
    public void testSimpleFunctions() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_simple_functions.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "25".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testNestedFunctions() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_nested_functions.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "S\nS".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testFunctionRecursion() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_function_recursion.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "120\n5".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testFunctionMultArgs() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_function_mult_args.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "90".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testFunctionFuncarg() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_function_funcarg.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "30".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");
        System.out.println(errorStream.toString());
        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testAnonymousFunctions() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_anonymous_functions.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "4".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        System.out.println(errorStream.toString());

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testAnyFunction() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_any_function.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "5".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testComposeFunction() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_func_compose.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "18".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        System.out.println(errorStream.toString());

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testFunctionSubtyping() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_functions_subtyping.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "{x1=1,x2=2,x3=0}".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        System.out.println(errorStream.toString());

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testFirstClassFuncContext() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_first_class_func_context.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testFuncEmptyArg() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_func_empty_arg.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testFunctionRecursionIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_function_recursion_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

}