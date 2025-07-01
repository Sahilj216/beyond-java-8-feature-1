import java.util.List;
import java.util.Map;
import java.util.Set;

public class Answer3 {

    public static void main(String[] args) {
        // Question : Use Of method to create List, Set and Map
        List<Integer> ls = List.of(1,2,3,4);
        Set<Integer> st = Set.of(1,2,3,4);
        Map<Integer,Integer> mp = Map.of(1,2,3,4);
        System.out.println("List: " + ls); // output: List: [1, 2, 3, 4]
        System.out.println("Set: " + st); // output: Set: [1, 2, 3, 4]
        System.out.println("Map: " + mp); // output: Map: {1=2, 3=4}
    }
}
