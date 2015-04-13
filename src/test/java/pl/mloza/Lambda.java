package pl.mloza;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    @Test
    public void testSimpleLambda() throws Exception {
        Arrays.asList("One", "Two", "Three", "Five")
                .forEach(element -> System.out.println(element));
    }

    @Test
    public void testLambdaWithBrackets() throws Exception {
        Arrays.asList("One", "Two", "Three", "Five")
                .forEach(element -> {
                    element = element + "!";
                    System.out.println(element);
                });
    }

    @Test
    public void testLambdaReturningValue() throws Exception {
        List<String> strings = Arrays.asList("One", "Two", "Three", "Five");
        strings.sort((e1, e2) -> e1.compareTo(e2));
        strings.forEach(element -> System.out.println(element));
    }

    @Test
    public void testLambdaReturningValueWithExpliciteReturn() throws Exception {
        List<String> strings = Arrays.asList("One", "Two", "Three", "Five");
        strings.sort((e1, e2) -> {
            return e1.compareTo(e2);
        });
        strings.forEach(element -> System.out.println(element));
    }
}
