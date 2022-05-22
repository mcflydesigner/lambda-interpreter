package arithmetic;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestArithmetic {

    private static String pathToTests = "tests/arithmetic/";

    @Test
    public void testSimpleSummation() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_simple_summation.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "11".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testSimpleSubtraction() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_simple_summation.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "-1".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testSimpleSummationWrongTypes() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_simple_summation.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    }
}
