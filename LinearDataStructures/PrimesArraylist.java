package LinearDataStructures;

import java.util.ArrayList;

/**
 * Created by tydimitrov on 19.9.2017 г..
 */
public class PrimesArraylist {
    public static ArrayList<Integer> getPrimes(int start, int end) {
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime==true){
                primeList.add(i);
            }
        }
        return primeList;
    }
public  static void main(String []args){
        ArrayList<Integer> primeList=getPrimes(200,300);
    for (int i: primeList ) {
        System.out.print(i+" ");
    }

}
}
