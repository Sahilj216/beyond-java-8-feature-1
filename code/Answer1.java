import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Answer1 {

    public static void main(String[] args) {
        // Question: Use iterator stream method to generate a stream
        
        Stream<Integer> map = Stream.iterate(0,n-> n < 10, n -> n + 1).map(n-> n * n);
        List<Integer> collect = map.collect(Collectors.toList());
        System.out.println(collect); // output: [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    }
}
