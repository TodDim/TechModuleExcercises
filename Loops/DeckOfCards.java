package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 12.7.2017 г..
 */
public class DeckOfCards {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <=14 ; i++) {
            if (    i==11){
                System.out.println( "vale pika");
                continue;
            }
            if (    i==12){
                System.out.println( "dama pika");
                continue;
            }
            if (    i==13){
                System.out.println( "pop pika");
                continue;
            }
            if (    i==14){
                System.out.println( "aso pika");
                continue;
            }
            System.out.println( "pika"+i);
        }
        for (int i = 2; i <=14 ; i++) {
            if (    i==11){
                System.out.println( "vale kupa");
                continue;
            }
            if (    i==12){
                System.out.println( "dama kupa");
                continue;
            }
            if (    i==13){
                System.out.println( "pop kupa");
                continue;
            }
            if (    i==14){
                System.out.println( "aso kupa");
                continue;
            }
            System.out.println( "kupa"+i);
        }
        for (int i = 2; i <=14 ; i++) {
            if (    i==11){
                System.out.println( "vale karo");
                continue;
            }
            if (    i==12){
                System.out.println( "dama karo");
                continue;
            }
            if (    i==13){
                System.out.println( "pop karo");
                continue;
            }
            if (    i==14){
                System.out.println( "aso karo");
                continue;
            }
            System.out.println( "karo"+i);
        }
        for (int i = 2; i <=14 ; i++) {
            if (    i==11){
                System.out.println( "vale spatiq");
                continue;
            }
            if (    i==12){
                System.out.println( "dama spatiq");
                continue;
            }
            if (    i==13){
                System.out.println( "pop spatiq");
                continue;
            }
            if (    i==14){
                System.out.println( "aso spatiq");
                continue;
            }
            System.out.println( "spatiq"+i);
        }
    }
}
