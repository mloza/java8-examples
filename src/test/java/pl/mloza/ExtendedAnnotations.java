package pl.mloza;

import pl.mloza.annotations.ExtendedAnnotation;

import java.util.ArrayList;
import java.util.Collection;

public class ExtendedAnnotations {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        final Holder<String> holder = new @ExtendedAnnotation Holder<String>();
        @ExtendedAnnotation
        Collection<@ExtendedAnnotation String> strings = new ArrayList<>();
    }

    public static class Holder<@ExtendedAnnotation T> extends @ExtendedAnnotation Object {
        public void method() throws @ExtendedAnnotation Exception {
        }
    }
}
