package pl.mloza.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Annotations.class)
public @interface Annotation {
    String value();
}
