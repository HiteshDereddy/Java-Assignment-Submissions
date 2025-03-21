import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
    String value();
}

class AnnotationProcessor {
    @CustomAnnotation("Hello, Annotation!")
    public void annotatedMethod() {}
    
    public static void main(String[] args) throws Exception {
        Method method = AnnotationProcessor.class.getMethod("annotatedMethod");
        CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
        if (annotation != null) {
            System.out.println("Annotation value: " + annotation.value());
        }
    }
}