// Three built-in Java annotations and their uses
public class BuiltInAnnotations {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }

    @SuppressWarnings("unchecked")
    public void suppressWarningsExample() {
        System.out.println("SuppressWarnings prevents compiler warnings");
    }

    @Override
    public String toString() {
        return "Override ensures correct method overriding";
    }
}