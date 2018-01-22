package ArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by TYDimitrov on 14.10.2017 г..
 */
public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int leftSum = 0;
        int rightSum = 0;
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = nums.length - 1; j > i; j--) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                count++;
                System.out.println(i);
            }
            leftSum = 0;
            rightSum = 0;
        }
        if (count == 0&&nums.length>1) {
            System.out.println("no");
            return;
        }
        if (nums.length==1){
            System.out.println(count);
            return;
        }


    }
}