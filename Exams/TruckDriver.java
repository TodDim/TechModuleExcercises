package Exams;
import java.util.Scanner;
/**
 * Created by TYDimitrov on 3.9.2017 г..
 */
public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season=scanner.nextLine();
        float kmPerMonth=scanner.nextFloat();
        double salary=0.0f;
        if (salary<=5000) {
            switch (season) {
                case "Spring":
                    salary = 0.9 * (kmPerMonth * 0.75 * 4);
                    break;
                case "Autumn":
                    salary = 0.9 * (kmPerMonth * 0.75 * 4);
                    break;
                case "Summer":
                    salary = 0.9 * (kmPerMonth * 0.9 * 4);
                    break;
                case "Winter":
                    salary = 0.9 * (kmPerMonth * 1.05 * 4);
                    break;
            }
        }
             else if (salary>5000&&(kmPerMonth<=10000)){
                switch (season){
                    case "Spring":
                        salary=0.9*(kmPerMonth*0.95*4);
                        break;
                    case "Autumn":
                        salary=0.9*(kmPerMonth*0.95*4);
                        break;
                    case "Summer":
                        salary=0.9*(kmPerMonth*1.1*4);
                        break;
                    case "Winter":
                        salary=0.9*(kmPerMonth*1.25*4);
                        break;
                }
            }
        else if (salary>10000&&(salary<=20000)){
                    salary=0.9*(salary*1.45*4);
        }
        System.out.printf("%.2f",salary);
    }
}