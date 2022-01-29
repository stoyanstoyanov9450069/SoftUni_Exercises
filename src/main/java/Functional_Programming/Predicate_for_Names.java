package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_for_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s"))
                .collect(Collectors.toList());

        Predicate<String> isNameLessOrEqual = name -> name.length() <= num;

        for (String name: names) {
            if (isNameLessOrEqual.test(name)){
                System.out.println(name);
            }
        }


    }
}
