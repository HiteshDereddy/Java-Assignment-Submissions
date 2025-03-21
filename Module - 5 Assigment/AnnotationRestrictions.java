import java.lang.annotation.*;

@interface RestrictedAnnotation {
    int value() default 5; 
}