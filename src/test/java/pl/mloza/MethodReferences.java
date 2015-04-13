package pl.mloza;

import org.junit.Test;
import pl.mloza.interfaces.DefaultAndStaticMethod;
import pl.mloza.interfaces.NotOverridingClass;
import pl.mloza.interfaces.OverridingClass;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    @Test
    public void testMethodReferences() {
        Arrays.asList("One", "Two", "Three", "Five")
                .forEach(System.out::println);
    }

    @Test
    public void testOwnMethodReference() {
        DefaultAndStaticMethod defaultAndStaticMethod = DefaultAndStaticMethod.create(OverridingClass::new);
        System.out.println(defaultAndStaticMethod.defaultMethod());

        defaultAndStaticMethod = DefaultAndStaticMethod.create(NotOverridingClass::new);
        System.out.println(defaultAndStaticMethod.defaultMethod());
    }

    @Test
    public void sortUsingMethodReference() {
        List<String> strings = Arrays.asList("One", "Two", "Three", "Five");
        strings.sort(String::compareTo);
        strings.forEach(System.out::println);
    }
}
