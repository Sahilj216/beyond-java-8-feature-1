import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Answer4 {

    public static void main(String[] args) {

        // Question: Create Unmodifiable List from a Steam
        List<Integer> collect = IntStream.range(0, 10).boxed().map(i->i).collect(Collectors.toUnmodifiableList());
        collect.set(1, 10); // This line will throw an UnsupportedOperationException
        System.out.println(collect); // output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
