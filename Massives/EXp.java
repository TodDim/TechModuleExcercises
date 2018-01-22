package Massives;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EXp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] items = scanner.nextLine().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] results = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            results[i] = Integer.parseInt(items[i]);
            System.out.println(results[i] + " ");
        }


        String[] javaStrings = scanner.nextLine().split(" ");
        double[] nums =
                Arrays.stream(javaStrings)
                        .mapToDouble(Double::parseDouble)
                        .toArray();
        for (double x : nums) {
            System.out.println(x);
        }

        String[] name = {"amit", "rahul", "surya"};
        String joined = String.join(",", name);

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        StringJoiner sj = new StringJoiner(" - ");
        DoubleStream.of(nums).forEach(x -> sj.add(String.valueOf(x)));
        System.out.println(sj.toString());



    }
}
