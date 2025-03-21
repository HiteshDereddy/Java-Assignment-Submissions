// @Documented meta-annotation
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface DocumentedAnnotation {}

public class DocumentedMetaAnnotation {
    @DocumentedAnnotation
    public void method() {}
}