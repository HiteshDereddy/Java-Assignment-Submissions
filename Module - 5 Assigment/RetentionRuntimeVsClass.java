// Difference between @Retention RUNTIME and CLASS
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS) // Available at compile-time, but removed at runtime
@interface ClassLevelAnnotation {}

@Retention(RetentionPolicy.RUNTIME) // Retained at runtime for reflection
@interface RuntimeLevelAnnotation {}
