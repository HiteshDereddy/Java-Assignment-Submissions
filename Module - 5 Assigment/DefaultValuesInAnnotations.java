// Default values in annotations
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface DefaultAnnotation {
    String value() default "Default";
}

public class DefaultValuesInAnnotations {
    @DefaultAnnotation
    public void method() {}
}