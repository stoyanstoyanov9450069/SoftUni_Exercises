package Sets_And_Maps;

import java.util.*;

public class Sets_of_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set1 = new LinkedHashSet<>();

        Set<Integer> set2 = new LinkedHashSet<>();

        Set<Integer> duplicates = new LinkedHashSet<>();

        String input = scanner.nextLine();
        int first_nums = Integer.parseInt(input.split("\\s")[0]);
        int second_nums = Integer.parseInt(input.split("\\s")[1]);

        for (int i = 0; i <first_nums ; i++) {
            int current_num = Integer.parseInt(scanner.nextLine());
            set1.add(current_num);
        }

        for (int j = 0; j < second_nums; j++) {
            int current_num = Integer.parseInt(scanner.nextLine());
            set2.add(current_num);
        }

        for (int number:set1) {
            if (set2.contains(number)){
                duplicates.add(number);
            }
        }

        for (int number: duplicates) {
            System.out.print(number + " ");
        }
    }
}
