package ListExcercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tydimitrov on 16.10.2017 г..
 */
public class ChangeSet {
    public static void main(String[] args) throws IOException  {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//            List<Integer> numbers = Arrays.stream(reader.readLine()
//                    .split("\\s+"))
//                    .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        String[] nums = reader.readLine().split("\\s+");
        for (String num : nums
                ) {
            numbers.add(Integer.parseInt(num));
        }
            String command = reader.readLine();

            while (!"Odd".equals(command) && !"Even".equals(command)) {
                String[] tokens = command.split("\\s+");
                switch (tokens[0]) {
                    case "Delete":
                        int deleteNumber = Integer.parseInt(tokens[1]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) == deleteNumber) {
                                numbers.remove(i);
                            }
                        }
                        break;
                    case "Insert":
                        int element = Integer.parseInt(tokens[1]);
                        int position = Integer.parseInt(tokens[2]);
                        numbers.add(position, element);
                        break;
                }

                command = reader.readLine();
                if ("Odd".equals(command)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                } else if ("Even".equals(command)) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                }

            }
        }
        catch (NullPointerException e){

        }
    }
}