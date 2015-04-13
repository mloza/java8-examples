package pl.mloza.interfaces;

import java.util.function.Supplier;

/**
 * Created by SG0218822 on 4/8/2015.
 */
public interface DefaultAndStaticMethod {

    static DefaultAndStaticMethod create(Supplier<DefaultAndStaticMethod> supplier) {
        return supplier.get();
    }

    static String whoAreYou() {
        return "I'm the Static One!";
    }

    default String defaultMethod() {
        return "Default method";
    }

    String methodNeedsImplementation();

}
