package arithmetic;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestArithmetic {

    @Test
    public void testSimpleSummation() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/arithmetic/test_simple_summation.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "11".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }

    @Test
    public void testSimpleSubtraction() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/arithmetic/test_simple_subtraction.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "-1".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }

    @Test
    public void testArithmeticOrder()  throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/arithmetic/test_arithmetic_order.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "50\n38".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }
}
