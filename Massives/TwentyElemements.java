package Massives;
//Да се напише програма, която създава масив с 20 елемента от целочислен тип и инициализира всеки от елементите със стойност
//        равна на индекса на елемента умножен по 5. Елементите на масива да се изведат на конзолата.
/**
 * Created by tydimitrov on 24.7.2017 г..
 */
public class TwentyElemements {
    public  static  void  main (String [] args){
        int [] massiv =new int[20];
        for (int i = 0; i < massiv.length-1; i++) {
            massiv[i]=i*5;
            System.out.print(massiv[i]);
            System.out.print( ", ");
        }
    }
}
