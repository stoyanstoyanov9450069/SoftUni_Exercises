package Sets_And_Maps;

import java.util.*;

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set_of_chemicals = new TreeSet<>();

        int num = scanner.nextInt();

        for (int i = 0; i <= num ; i++) {
            String[] chemicals = scanner.nextLine().split("\\s");
            set_of_chemicals.addAll(Arrays.asList(chemicals));
        }

        set_of_chemicals.forEach(e -> System.out.print(e + " "));
    }
}
