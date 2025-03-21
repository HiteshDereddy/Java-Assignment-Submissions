// List of meta-annotations in Java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExampleAnnotation {}

public class AvailableMetaAnnotations {
    @ExampleAnnotation
    public void testMethod() {}
}