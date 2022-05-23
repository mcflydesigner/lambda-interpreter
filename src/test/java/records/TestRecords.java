package records;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestRecords {

    private static String pathToTests = "tests/records/";

    @Test
    public void testSimpleRecords() throws Exception {
        // String expected = "10\n25".trim();
        InputStream inputStream = getInputStream(pathToTests + "test_simple_records.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "11.18".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testRecords() throws Exception {
        // String expected = "10\n25".trim();
        InputStream inputStream = getInputStream(pathToTests + "test_record_subtyping.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "11.18".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

}