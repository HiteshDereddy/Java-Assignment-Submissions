// Can annotations be inherited?
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface InheritedAnnotation {}

@InheritedAnnotation
class Parent {}

class Child extends Parent {}

public class InheritedAnnotations {
    public static void main(String[] args) {
        System.out.println(Child.class.isAnnotationPresent(InheritedAnnotation.class)); // true
    }
}