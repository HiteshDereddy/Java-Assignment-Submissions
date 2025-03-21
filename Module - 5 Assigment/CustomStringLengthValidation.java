// Custom annotation for string length validation
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface StringLength {
    int min() default 1;
    int max();
}

public class CustomStringLengthValidation {
    @StringLength(max = 10)
    private String text;
}