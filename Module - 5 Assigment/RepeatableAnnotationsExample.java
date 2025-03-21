// Repeatable annotations example
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(RepeatedAnnotations.class)
@interface RepeatableAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RepeatedAnnotations {
    RepeatableAnnotation[] value();
}

public class RepeatableAnnotationsExample {
    @RepeatableAnnotation("First")
    @RepeatableAnnotation("Second")
    public void repeatedMethod() {}
}