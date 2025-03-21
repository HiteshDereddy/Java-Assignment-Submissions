public class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.addItem("Hello");
        System.out.println(strBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.addItem(100);
        System.out.println(intBox.getItem());
    }
}
