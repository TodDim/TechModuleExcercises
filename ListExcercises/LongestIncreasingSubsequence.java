package ListExcercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int [] length = new int[numbers.size()];
        int [] prev = new int[numbers.size()];
        int maxLength = 0;
        int lastIndex = -1;
        for (int i = 0; i < numbers.size(); i++)
        {
            length[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++)
            {
                if (numbers.get(j) < numbers.get(i) && length[j] + 1 > length[i])
                {
                    length[i] = length[j] + 1;
                    prev[i] = j;
                }
            }
            if (length[i] > maxLength)
            {
                maxLength = length[i];
                lastIndex = i;
            }
        }
        List<Integer> increasing=new ArrayList<>();
        while (lastIndex != -1)
        {
            increasing.add(numbers.get(lastIndex));
            lastIndex = prev[lastIndex];
        }
        Collections.reverse(increasing);
        System.out.println(increasing);








    }
}