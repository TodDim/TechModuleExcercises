package Objects;
public class StartTime {

public  static void main(String[]args){
    long millis = System.currentTimeMillis();
    System.out.println(millis / 1000); // prints the same Unix timestamp in seconds
}
}
