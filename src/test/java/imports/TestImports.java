package imports;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestImports {

    private static String pathToTests = "tests/imports/";

    @Test
    public void testImports() throws Exception {
        // String expected = "10\n25".trim();
        InputStream inputStream = getInputStream(pathToTests + "test_imports.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "10\n25".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testImportFileNotFound() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_import_file_not_found.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testImportMethodNotFound() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_import_method_not_found.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

}
