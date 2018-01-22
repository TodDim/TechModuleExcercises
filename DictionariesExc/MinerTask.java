package DictionariesExc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> resAndQuantities = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String value = scanner.nextLine();
            if (resAndQuantities.containsKey(input)){
                resAndQuantities.put(input, resAndQuantities.get(input) + Integer.parseInt(value));
            }
            else {
                resAndQuantities.put(input, Integer.parseInt(value));
            }
            input = scanner.nextLine();
        }

        for (String s : resAndQuantities.keySet()) {
            System.out.println(s + " -> " + resAndQuantities.get(s));
        }
    }
}
