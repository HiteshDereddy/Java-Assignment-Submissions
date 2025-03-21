// Difference between @Override and @Deprecated annotations
class Parent {
    void show() {}
}

public class OverrideVsDeprecated extends Parent {
    @Override
    void show() {
        System.out.println("Override ensures method is correctly overridden");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}