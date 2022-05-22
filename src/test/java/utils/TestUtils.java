package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestUtils {

    private static final ClassLoader classLoader = TestUtils.class.getClassLoader();

    public static InputStream getInputStream(String filePath) throws IOException {
        File file = new File(classLoader.getResource(filePath).getFile());
        FileInputStream fis = new FileInputStream(file);
        InputStream inputStream = new java.io.ByteArrayInputStream(fis.readAllBytes());

        return inputStream;
    }

}
