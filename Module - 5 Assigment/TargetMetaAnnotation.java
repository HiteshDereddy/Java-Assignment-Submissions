// Purpose of @Target meta-annotation
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@interface FieldAnnotation {}

public class TargetMetaAnnotation {
    @FieldAnnotation
    private String field;
}