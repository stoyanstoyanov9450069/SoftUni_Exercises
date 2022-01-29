package Functional_Programming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Custom_Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        Predicate<Integer> isOdd = num -> num % 2 != 0;

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer :: parseInt).collect(Collectors.toList());

        List<Integer> orderedEvenNums = new ArrayList<>();
        List<Integer> orderedOddNums = new ArrayList<>();

        for (Integer num: nums) {
            if (isEven.test(num)){
                orderedEvenNums.add(num);
            }else if (isOdd.test(num)){
                orderedOddNums.add(num);
            }
        }

        Collections.sort(orderedEvenNums);
        Collections.sort(orderedOddNums);

        for (Integer num: orderedEvenNums) {
            System.out.print(num + " ");
        }
        for (Integer num : orderedOddNums) {
            System.out.print(num + " ");
        }
    }
}
