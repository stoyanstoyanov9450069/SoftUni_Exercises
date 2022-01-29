package Sets_And_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> emails_data = new LinkedHashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")){
            String email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")){
                emails_data.put(name,email);
            }

            name = scanner.nextLine();
        }

        emails_data.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
