package Functional_Programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_the_Smallest_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer :: parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findTheSmallest = list -> Collections.min(list);

        System.out.println(nums.lastIndexOf(findTheSmallest.apply(nums)));

    }
}
