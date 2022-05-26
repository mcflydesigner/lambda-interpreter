package syntax;

import com.interpreter.MainTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static utils.TestUtils.getInputStream;

public class TestSyntax {

    private static String pathToTests = "tests/syntax/";

    @Test
    public void testAscriptionIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "ascription_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testCommentIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "comment_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testConditionsIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "conditions_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testDeclIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "decl_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testFunctionsIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "functions_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testImportIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "import_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testRecordIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "records_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void testTypeinferenceIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "typeinference_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

    @Test
    public void functionsArgtypesIncorr() throws Exception {
        InputStream inputStream = getInputStream(pathToTests + "functions_argtypes_incorr.nk");
        OutputStream errorStream = new ByteArrayOutputStream();
        OutputStream outputStream = new ByteArrayOutputStream();

        MainTest.test(inputStream, errorStream, outputStream);

        Assert.assertFalse(errorStream.toString().isEmpty());
    };

}
