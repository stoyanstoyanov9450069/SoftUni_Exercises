package Sets_And_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String data = scanner.nextLine();
        while(!data.equals("search")){
            String name = data.split("-")[0];
            String phone_number = data.split("-")[1];
            phonebook.put(name,phone_number);
            data = scanner.nextLine();
        }

        String input = scanner.nextLine();
        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){
                System.out.println(input + " -> " + phonebook.get(input));
            }else {
                System.out.printf("Contact %s does not exist.\n", input);
            }

            input = scanner.nextLine();
        }

    }
}
