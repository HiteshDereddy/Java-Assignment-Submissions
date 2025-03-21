public class UserDefinedGeneric<T> {
    private T value;

    public UserDefinedGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        UserDefinedGeneric<String> strExample = new UserDefinedGeneric<>("Hello, Generics!");
        System.out.println(strExample.getValue());
    }
}
