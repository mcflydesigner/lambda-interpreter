package std;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class testStd {

    private static String pathToTests = "tests/std/";

    @Test
    public void testCasting() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_casting.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "10.0\nNumber: 10\n20\nReal number: 10.5\n15.0\n15".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }



}
