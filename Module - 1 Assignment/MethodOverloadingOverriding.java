
// Demonstrating Method Overloading and Method Overriding
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b + 10; // Overriding method
    }
}

public class MethodOverloadingOverriding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 4));

        Calculator advCalc = new AdvancedCalculator();
        System.out.println(advCalc.add(2, 3));
    }
}
