package Sets_And_Maps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usernames = new LinkedHashSet<>(); //запазваме реда на добавяне
        int countUsernames = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countUsernames; count++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }

        usernames.forEach(System.out::println);
        /*for (String username : usernames) {
            System.out.println(username);
        }*/
    }
}

