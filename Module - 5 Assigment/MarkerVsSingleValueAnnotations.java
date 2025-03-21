// Marker vs Single-value annotations
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {} // Marker annotation has no methods

@Retention(RetentionPolicy.RUNTIME)
@interface SingleValueAnnotation {
    String value();
}

public class MarkerVsSingleValueAnnotations {
    @MarkerAnnotation
    public void markerMethod() {}

    @SingleValueAnnotation("Example Value")
    public void singleValueMethod() {}
}