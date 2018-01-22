package LinearDataStructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by tydimitrov on 19.9.2017 г..
 */
public class Opashka {
    public static void main(String[] args) {
        int n =3;
        int p=16;
Queue<Integer> queue=new LinkedList<Integer>();
        System.out.print("S = ");
        queue.offer(n);
        int index=0;
        while (queue.size()>0){
            index++;
            int current=queue.poll();
            System.out.print(current+" ");
            if (current==p){
                System.out.println();
                System.out.print("Index="+index);
                return;
            }
            queue.offer(current+1);
            queue.offer(current*2);
        }

    }
}