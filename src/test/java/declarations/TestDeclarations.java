package declarations;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestDeclarations {

    private static String pathToTests = "tests/declarations/";

    @Test
    public void testDeclarations() throws Exception {
        //5
        //10.5
        //False
        //Simple string
        //4
        InputStream inputStream = getInputStream(pathToTests + "test_declarations.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "5\n10.5\nfalse\nSimple string\n4".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");
        System.out.println(errorStream.toString());
        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testDeclarationsGlobal() throws Exception {
        // 10.5
        InputStream inputStream = getInputStream(pathToTests + "test_declaration_global.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "10.2".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testDeclarationsLocal() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "test_declaration_local.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testDeclarationFunctionAliases() throws Exception {
        // 10.5
        InputStream inputStream = getInputStream(pathToTests + "test_declaration_function_aliases.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "10.5".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }

    @Test
    public void testDeclarationTypeInference() throws Exception {
        // 10.5
        InputStream inputStream = getInputStream(pathToTests + "test_declaration_type_inference.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        String expected = "5\n7.0".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
        Assert.assertTrue(errorStream.toString().isEmpty());
    }
}
