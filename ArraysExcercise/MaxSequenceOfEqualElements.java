package ArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int countOfEquals = 1;
        int valueOfEquals = 0;
        int valueOFMaxEquals=0;
        int countOfMaxSequence=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                countOfEquals=1;
            }
            else if (nums[i] == nums[i - 1]) {
                countOfEquals++;
                valueOfEquals = nums[i];
            }
            if (countOfEquals>countOfMaxSequence){
                countOfMaxSequence=countOfEquals;
                valueOFMaxEquals=nums[i];
            }
        }
        int massivOfEquals[] = new int[countOfMaxSequence];
        for (int i = 0; i < massivOfEquals.length; i++) {
            massivOfEquals[i] = valueOFMaxEquals;
            System.out.print(massivOfEquals[i] + " ");

        }
    }
}