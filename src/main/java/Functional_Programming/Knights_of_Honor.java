package Functional_Programming;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;



public class Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s");

        List<String> list = Arrays.stream(input).collect(Collectors.toList());

        Consumer<String> consumer = e -> System.out.println("Sir " + e);

        list.forEach(consumer);
    }
}
