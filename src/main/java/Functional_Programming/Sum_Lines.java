package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Sum_Lines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> printer = e -> System.out.println(e);

        String[] input = scanner.nextLine().split("\\s");

        List<String> list = Arrays.stream(input).collect(Collectors.toList());

        list.forEach(printer);

    }
}
