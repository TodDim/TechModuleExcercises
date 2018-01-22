package ConditionalConstructions;

import java.util.Scanner;

public class AbsOfThreeNumbers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter x:");
        int x=scanner.nextInt();
        System.out.print( "Enter y:");
        int y= scanner.nextInt();
        System.out.print( "Enter z:");
        int z= scanner.nextInt();
        int biggerNimber=x;
        if (Math.abs(y)>Math.abs(x)){
            biggerNimber=y;
        }
        else if (Math.abs(z)>Math.abs(y)){
            biggerNimber=z;
        }
        System.out.println( "Biggest abs is: "+biggerNimber);
    }
}
