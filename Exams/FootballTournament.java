package Exams;
import java.util.Scanner;
public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stadium capacity");
        short stadiumCapacity = scanner.nextShort();
        System.out.println("Enter fans number");
        short fansNumber = scanner.nextShort();
        short countSectorA=0;
        short countSectorB=0;
        short countSectorV=0;
        short countSectorG=0;
        float allFansToStadiumCapacity=0.0f;
        for (short i = 0; i <fansNumber ; i++) {
            char sector=0;
            sector=scanner.next().charAt(0);
            if (sector=='A'){
                countSectorA++;
            }
            else if (sector=='B'){
                countSectorB++;
            }
            else if (sector=='V'){
                countSectorV++;
            }
            else if (sector=='G'){
                countSectorG++;
            }
        }
        System.out.printf("%.2f%%\n",(float)countSectorA/(float)fansNumber*100);
        System.out.printf("%.2f%%\n",(float)countSectorB/(float)fansNumber*100);
        System.out.printf("%.2f%%\n",(float)countSectorV/(float)fansNumber*100);
        System.out.printf("%.2f%%\n",(float)countSectorG/(float)fansNumber*100);
        System.out.printf("%.2f%%\n",(float)fansNumber/(float)stadiumCapacity*100);

    }
}