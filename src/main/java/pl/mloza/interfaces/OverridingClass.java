package pl.mloza.interfaces;

public class OverridingClass implements DefaultAndStaticMethod {
    @Override
    public String defaultMethod() {
        return "Override default method";
    }

    @Override
    public String methodNeedsImplementation() {
        return "Method needs implementation (Overriding class)";
    }
}
