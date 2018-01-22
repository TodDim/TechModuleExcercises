package ArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by TYDimitrov on 12.10.2017 г..
 */
public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] massiv =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int mostCommon=0;
        int finalCount=0;
        for (int i = 0; i < massiv.length; i++) {
            int count=0;
            for (int j = 0; j <massiv.length ; j++) {
                if (massiv[i]==massiv[j]){
                    count++;
                }
            }
            if(count>finalCount){
                finalCount=count;
                mostCommon=massiv[i];
            }
        }
        System.out.println(mostCommon );
    }
}