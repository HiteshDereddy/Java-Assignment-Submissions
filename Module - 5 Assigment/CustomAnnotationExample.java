// Creating a custom annotation
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {
    String value();
}

public class CustomAnnotationExample {
    @CustomAnnotation("Example")
    public void annotatedMethod() {}
}