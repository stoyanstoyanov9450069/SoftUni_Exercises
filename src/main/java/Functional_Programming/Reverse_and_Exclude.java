package Functional_Programming;

import java.beans.IntrospectionException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(list);

        Predicate<Integer> isOdd = number -> number % n == 0;

        list.removeIf(isOdd);

        for (Integer number: list) {
            System.out.print(number + " ");
        }
    }
}
