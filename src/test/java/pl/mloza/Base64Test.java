package pl.mloza;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Test {
    @Test
    public void testBase64() throws Exception {
        final String text = "Hello Base64!";
        final String encoded = Base64
                .getEncoder()
                .encodeToString(text.getBytes(StandardCharsets.UTF_8));

        System.out.println(encoded);

        final String decoded = new String(
                Base64.getDecoder().decode(encoded),
                StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}
