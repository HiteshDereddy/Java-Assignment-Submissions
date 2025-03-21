// Retention policy and types
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS) // Available at compile-time, not runtime
@interface CompileTimeAnnotation {}

@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@interface RuntimeAnnotation {}
