import java.lang.annotation.*;

@interface NoRetention {}
class TestClass {
    @NoRetention
    public void testMethod() {}
}