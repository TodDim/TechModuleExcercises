package ArraysExcercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by tydimitrov on 11.10.2017 г..
 */
public class FoldAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums =
                Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

int [] leftFold=new int[nums.length/4];
        int [] rightFold=new int[nums.length/4];
        int [] resultArray=new int[nums.length/2];
        for (int i = 0; i <nums.length/4 ; i++) {
            leftFold[i]=nums[(nums.length/4)-1-i];
            rightFold[i]=nums[(nums.length)-1-i];
        }
        for (int i = 0; i <nums.length/4 ; i++) {
            resultArray[i]=leftFold[i]+nums[nums.length/4+i];
            resultArray[nums.length/2-1-i]=rightFold[i]+nums[nums.length-nums.length/2+i];
        }
        for (int x:resultArray
             ) {
            System.out.print(x+" ");
        }

    }

}
