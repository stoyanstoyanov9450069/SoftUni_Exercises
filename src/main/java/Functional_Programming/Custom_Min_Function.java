package Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallest = list -> Collections.min(list);

        System.out.println(findSmallest.apply(numbersList));
    }
}
