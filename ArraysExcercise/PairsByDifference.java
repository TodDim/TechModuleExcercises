package ArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by TYDimitrov on 14.10.2017 г..
 */
public class PairsByDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int diff=scanner.nextInt();
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if (nums[j]-nums[i]==diff){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}