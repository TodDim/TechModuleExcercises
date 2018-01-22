package DictionariesExc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Map<String, String> fixedmeils = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (email.substring(email.length()-2,email.length()).equals("uk")||email.substring(email.length()-2,email.length()).equals("us")){
            }
            else {
                fixedmeils.put(name, email);
            }
            name = scanner.nextLine();
        }

        for (String s : fixedmeils.keySet()) {
            System.out.println(s + " -> " + fixedmeils.get(s));
        }
    }
}
