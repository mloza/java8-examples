package pl.mloza;

import org.junit.Test;
import pl.mloza.interfaces.DefaultAndStaticMethod;
import pl.mloza.interfaces.NotOverridingClass;
import pl.mloza.interfaces.OverridingClass;

import java.util.Arrays;
import java.util.List;

public class Interfaces {
    @Test
    public void testDefaultMethods() throws Exception {
        final List<DefaultAndStaticMethod> defaultAndStaticMethods = Arrays.asList(new OverridingClass(), new NotOverridingClass());
        defaultAndStaticMethods.forEach(element -> System.out.println(element.getClass().getName() + ": " + element.defaultMethod()));
        defaultAndStaticMethods.forEach(element -> System.out.println(element.getClass().getName() + ": " + element.methodNeedsImplementation()));
    }

    @Test
    public void testStaticMethods() throws Exception {
        System.out.println(DefaultAndStaticMethod.whoAreYou());
    }

    @Test
    public void testStaticAndDefaultMethods() throws Exception {
        DefaultAndStaticMethod defaultAndStaticMethod = DefaultAndStaticMethod.create(OverridingClass::new);
        System.out.println(defaultAndStaticMethod.defaultMethod());

        defaultAndStaticMethod = DefaultAndStaticMethod.create(NotOverridingClass::new);
        System.out.println(defaultAndStaticMethod.defaultMethod());
    }
}
