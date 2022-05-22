package declarations;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestDeclarations {

    @Test
    public void testDeclarations() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/conditions/test_declarations.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "5\n10.5\nFalse\nSimple string\n4".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }

    @Test
    public void testDeclarationsGlobalLocal() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/conditions/test_declaration_gloabl_local.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "10.5\nError".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }
}
