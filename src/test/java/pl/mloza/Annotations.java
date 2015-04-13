package pl.mloza;

import org.junit.Test;
import pl.mloza.annotations.Annotated;
import pl.mloza.annotations.Annotation;

import java.util.Arrays;

public class Annotations {
    @Test
    public void testRepeatableAnnotations() throws Exception {
        Arrays.asList(Annotated.class.getAnnotationsByType(Annotation.class))
                .forEach(annotation -> System.out.println(annotation.value()));
    }
}
