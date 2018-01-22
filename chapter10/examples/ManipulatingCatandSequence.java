package chapter10.examples;
import chapter10.Cat;
import chapter10.Sequence;

public class ManipulatingCatandSequence {
    public static void  main(String[]args){
        Cat Baio =new Cat("Baio","bqla");
        Baio.sayMiau();
        Cat someCat= new Cat();
        System.out.printf("Tha cat %s is %s\n",Baio.getName(),Baio.getColor());
someCat.sayMiau();
        System.out.printf("Sequence [1,2,3] is %d,%d,%d\n", Sequence.nextValue(),Sequence.nextValue(),Sequence.nextValue());
        Baio.setName("Gosho");
        System.out.println("Baios new name is "+Baio.getName());
        Cat [] cats=new Cat[10];
        for (int i = 1; i <=10 ; i++) {
            cats[i]=new Cat("Cat"+i);
            cats[i].sayMiau();
        }
    }
}
