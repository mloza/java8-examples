package pl.mloza;

import org.junit.Test;

import java.util.Optional;

public class OptionalUsage {

    public void useOptional(Optional<String> optional) {
        System.out.println("Full Name is set? " + optional.isPresent());
        System.out.println("Full Name: " + optional.orElseGet(() -> "[none]"));
        System.out.println(optional.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

    }

    @Test
    public void testOptionalNull() throws Exception {
        Optional<String> fullName = Optional.ofNullable(null);
        useOptional(fullName);
    }

    @Test
    public void testOptionalFilled() throws Exception {
        Optional<String> fullName = Optional.of("Michal");
        useOptional(fullName);
    }
}
