import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class ExampleClass {
    @LogExecutionTime
    public void exampleMethod() {}
    
    public static void main(String[] args) throws Exception {
        Method method = ExampleClass.class.getMethod("exampleMethod");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            System.out.println("LogExecutionTime annotation is present.");
        }
    }
}