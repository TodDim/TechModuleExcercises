package DictionariesExc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, String> phonebook = new TreeMap<>();
//        Map<String, String> phonebook = new HashMap<String, String>();
        while (!input.equals("END")) {
            String[] words = input.split("\\s+");
            if (words[0].equals("A")) {
                if (phonebook.containsKey(words[1])) {
                    phonebook.put(words[1], words[2]);
                } else {
                    phonebook.put(words[1], words[2]);
                }
            } else if (words[0].equals("S")) {
                if (phonebook.containsKey(words[1])) {
                    System.out.printf("%s -> %s%n", words[1], phonebook.get(words[1]));
                } else {
                    System.out.printf("Contact %s does not exist.%n", words[1]);
                }
            } else if (words[0].equals("ListAll")) {
                for (String s : phonebook.keySet()) {
                    System.out.println(s +" -> "+ phonebook.get(s));
                }
            }
            input = scanner.nextLine();
        }
    }
}
