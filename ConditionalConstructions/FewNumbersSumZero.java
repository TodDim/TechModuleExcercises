package ConditionalConstructions;

import java.util.Scanner;

public class FewNumbersSumZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.print("Enter z: ");
        int z = scanner.nextInt();
        int sumxy=x+y;
        int sumxz=x+z;
        int sumyz=y+z;
        switch (   sumxy){
case    0:
    System.out.printf("%d+%d==0",x,y);
break;    }
    }
}
