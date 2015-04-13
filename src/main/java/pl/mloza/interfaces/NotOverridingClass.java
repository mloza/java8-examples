package pl.mloza.interfaces;

public class NotOverridingClass implements DefaultAndStaticMethod {
    @Override
    public String methodNeedsImplementation() {
        return "Method needs implementation (NotOverridingClass)";
    }
}
