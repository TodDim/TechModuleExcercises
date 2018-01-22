package SoftuniExam;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 17.9.2017 г..
 */
public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short control = scanner.nextShort();
        if ((control>=4)&&(control<=144)){
            int number = 0;
            int count = 0;
            String result = null;
            for (int a = 1; a <= 8; a++) {
                for (int b = 1; b <= 9; b++) {
                    for (int c = 1; c <= 9; c++) {
                        for (int d = 1; d <= 8; d++) {
                            if ((c != d) && (b != a) && (c > d) && (a < b)) {
                                number = a * b + c * d;
                                if (number == control) {
                                    count++;
                                    System.out.printf("%d%d%d%d ", a, b, c, d);
                                    if (count == 4) {
                                        result = "" + a + b + c + d;
                                    }

                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
            if (count > 3) {
                System.out.printf("Password: %s", result);
            }
            else if ((count==0)||(count<4)){
                System.out.println("No!");
            }
        }
    }
        }

