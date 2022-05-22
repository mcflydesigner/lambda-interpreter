package imports;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestImports {

    @Test
    public void testDeclarations() throws IOException {
        OutputStream outputStream = new java.io.ByteArrayOutputStream();
        InputStream inputStream = getInputStream("tests/conditions/test_imports.nk");

        MainTest.test(inputStream, outputStream);

        String expected = "10\n25".trim();
        String output = outputStream.toString().trim().replaceAll("\r\n", "\n");

        Assert.assertEquals(expected, output);
    }
}
