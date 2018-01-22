package OperatorsandExpressions;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class PointInRectangle {
    public static  void main(String[] args){
        while (true) {

            Scanner scanner= new Scanner(System.in);
            short pointx = scanner.nextShort();
            short pointy = scanner.nextShort();
            double position = sqrt(pointx*pointx+pointy*pointy);
            System.out.println( position);
            if ((position>5)){
                System.out.println("point is not in circle ");
            }
            else if((position<5)&&(pointx<-1)||(pointy<-1)){
                System.out.println("point is in circle but not in rectangle ");
            }
                        }
        }
    }


