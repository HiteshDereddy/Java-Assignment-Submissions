import java.util.Map;
import java.util.TreeMap;

public class ProductPriceSorter {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Laptop", 1000.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        System.out.println("Products in sorted order: " + products);
    }
}