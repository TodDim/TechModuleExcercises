package Exams;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 3.9.2017 г..
 */
public class GrapeAndRakia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float area = scanner.nextFloat();
    float kgPerSqMeter = scanner.nextFloat();
    float brak = scanner.nextFloat();
    double incomeRakia=(area*10-brak)*0.45/7.5*9.8;
    System.out.printf("%.2f%n",incomeRakia);
    double grapeIncome=0.55*(area*10-brak)*1.50;
    System.out.printf("%.2f%n",grapeIncome);
}
}