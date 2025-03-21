public class BoundedTypeParameter<T extends Number> {
    private T number;

    public BoundedTypeParameter(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public static void main(String[] args) {
        BoundedTypeParameter<Integer> intObj = new BoundedTypeParameter<>(10);
        System.out.println("Number: " + intObj.getNumber());
    }
}
