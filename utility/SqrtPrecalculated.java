package utility;

/**
 * Created by tydimitrov on 6.7.2017 г..
 */
public class SqrtPrecalculated {
    private static int MAX_VALUE = 1000;
    private  static double[] squares;
    static {
        squares=new double[MAX_VALUE];
    }
    public static double getSqrt(int value){
        if (squares[value]==0.0){
            squares[value]=Math.sqrt(value);
        }
        return squares[value];
    }
}
