package conditions;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestConditions {

    @Test
    public void testConditions() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/conditions/test_conditions.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "1\n7\n2".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }

    @Test
    public void testCompConditions() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/conditions/test_comp_conditions.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "80\n42\n0".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }
}
