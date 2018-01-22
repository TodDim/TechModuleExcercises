package ArraysExcercise;

import java.util.Scanner;

public class LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        int length = Math.min(arr1.length, arr2.length);
        int count = 0;
        int startPosition = 0;
        int count2 = 0;

        for (int i = 0; i < length; i++) {
            if (arr1[i].equals(arr2[i])) {
                count++;
            }
            if (arr1[arr1.length - 1 - i].equals(arr2[arr2.length - 1 - i])) {
                count2++;
            }
        }
        System.out.println(Math.max(count, count2));
    }
}
