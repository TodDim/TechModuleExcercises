package ArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int k = scanner.nextInt();
        int[] sum = new int[nums.length];

        for (int j = 0; j < k; j++) {
            for (int i = nums.length-1; i >0 ; i--) {
                int x =nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=x;
            }
//            for (int i = 0; i < nums.length - 1; i++) {
//                int x = nums[nums.length - 1 - i];
//                nums[nums.length - 1 - i] = nums[nums.length - 1 - (i + 1)];
//                nums[nums.length - 1 - (i + 1)] = x;
//            }
            for (int i = 0; i < nums.length; i++) {
                sum[i] += nums[i];
            }
        }
        for (int x : sum
                ) {
            System.out.print(x+" ");
        }
    }
}

