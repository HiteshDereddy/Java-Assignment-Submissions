// Using reflection to process annotations
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ReflectionAnnotation {}

public class ReflectionProcessingAnnotations {
    @ReflectionAnnotation
    public void testMethod() {}

    public static void main(String[] args) throws Exception {
        Method method = ReflectionProcessingAnnotations.class.getMethod("testMethod");
        if (method.isAnnotationPresent(ReflectionAnnotation.class)) {
            System.out.println("Reflection detected annotation on: " + method.getName());
        }
    }
}