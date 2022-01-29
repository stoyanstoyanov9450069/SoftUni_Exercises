package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class List_of_Predicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isOdd = num -> num % 2 != 0;

        List<Integer> listOfNum = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<Integer, List<Integer>, Boolean> isDivisable = ((number, list) ->
        {
            for (Integer num : list) {
                if (num % number != 0) {
                    return false;
                }

            }
            return true;
        });


        for (int number = 0; number <= n ; number++) {
            isDivisable.apply(number, listOfNum); {
                System.out.print(number + " ");
            }
        }
    }
}
