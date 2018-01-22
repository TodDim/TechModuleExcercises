package ListExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppendLists {
    public static String[] removeEmptyEntries (String[] collection){
        ArrayList<String> nonEmpty = new ArrayList<String>();
        for (String o : collection) {
            if (o.length() > 0) {
                nonEmpty.add(o);
            }
        }
        String[] results=new String[nonEmpty.size()];
        for (int i = 0; i < results.length; i++) {
             results[i]=nonEmpty.get(i);
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<Integer>();
        String[] tokens = scanner.nextLine().split("\\|");
        for (int i = tokens.length - 1; i >= 0; i--) {
            int[] elements = Arrays.stream(removeEmptyEntries(tokens[i].split("\\s+")))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < elements.length; j++) {
                result.add(elements[j]);
            }
        }
        for (int x : result
                ) {
            System.out.print(x + " ");
        }

    }
}