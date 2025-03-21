import java.util.List;

public class MinMaxFinder<T extends Comparable<T>> {
    private List<T> elements;

    public MinMaxFinder(List<T> elements) {
        this.elements = elements;
    }

    public T findMin() {
        return elements.stream().min(Comparable::compareTo).orElse(null);
    }

    public T findMax() {
        return elements.stream().max(Comparable::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5);
        MinMaxFinder<Integer> finder = new MinMaxFinder<>(numbers);
        System.out.println("Min: " + finder.findMin() + ", Max: " + finder.findMax());

        List<String> words = List.of("Apple", "Orange", "Banana");
        MinMaxFinder<String> stringFinder = new MinMaxFinder<>(words);
        System.out.println("Min: " + stringFinder.findMin() + ", Max: " + stringFinder.findMax());
    }
}
