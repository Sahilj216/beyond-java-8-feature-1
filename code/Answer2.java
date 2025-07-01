import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Answer2 {

    public static void main(String[] args) {
        // Question: Convert an Optional type into Stream
        
        Optional<List<Integer>> ls = Optional.of(new ArrayList<>(List.of(1,2,3,4,5,6)));
        // using stream method to convert Optional to Stream
        ls.stream().flatMap(i-> i.stream()).filter(i-> i > 4).findFirst().stream().forEach(System.out::println);
    }
}
