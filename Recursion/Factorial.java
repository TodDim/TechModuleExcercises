package Recursion;
//n! = 1, при n = 0
//        n! = n.(n-1)! за n>0
public class Factorial {
    public static long fact(int n) {
        if (n == 0)
            return 1;
        return fact(n - 1)*n;
    }
    public  static  void  main (String[] args){
        System.out.println(fact(5));
    }
}
