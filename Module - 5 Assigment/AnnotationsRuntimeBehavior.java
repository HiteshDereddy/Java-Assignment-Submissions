// How annotations affect runtime behavior
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeAnnotation {}

public class AnnotationsRuntimeBehavior {
    @RuntimeAnnotation
    public void test() {}

    public static void main(String[] args) {
        Method[] methods = AnnotationsRuntimeBehavior.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RuntimeAnnotation.class)) {
                System.out.println("Runtime annotation detected on method: " + method.getName());
            }
        }
    }
}