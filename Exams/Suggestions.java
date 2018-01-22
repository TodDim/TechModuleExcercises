package Exams;

import java.util.Scanner;
public class Suggestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter big letter");
        char bigLetter = scanner.next().charAt(0);
        System.out.println("Enter small letter1");
        char smallLetter1 = scanner.next().charAt(0);
        System.out.println("Enter small letter2");
        char smallLetter2 = scanner.next().charAt(0);
        System.out.println("Enter small letter3");
        char smallLetter3 = scanner.next().charAt(0);
        System.out.println("Enter digit");
        char digit = scanner.next().charAt(0);
        char[] currentName = new char[5];
        currentName[0] = 'A';
        currentName[1] = 'a';
        currentName[2] = 'a';
        currentName[3] = 'a';
        currentName[4] = '0';
        int count=0;
        for (int p = currentName[0]; p <= (int) bigLetter; p++) {
            currentName[1] = (int) 97;
            currentName[2] = (int) 97;
            currentName[3] = (int) 97;
            currentName[4] = (int) 48;
            for (int m = currentName[1]; m <= (int) smallLetter1; m++) {
                currentName[2] = (int) 97;
                currentName[3] = (int) 97;
                currentName[4] = (int) 48;
                for (int i = currentName[2]; i <= (int) smallLetter2; i++) {
                    currentName[3] = (int) 97;
                    currentName[4] = (int) 48;
                    for (int b = currentName[3]; b <= (int) smallLetter3; b++) {
                        currentName[4] = (int) 48;
                        for (int t = (int) currentName[4]; t <=(int)digit ; t++) {
//                            for (int k = 0; k < currentName.length; k++) {
//                                System.out.print(currentName[k] + ",");
//                            }
//                            System.out.print(" ");
                            count++;
                            currentName[4]++;
                        }
                        currentName[3]++;
                    }
                    currentName[2]++;
                }
                currentName[1]++;
            }
            currentName[0]++;
        }
        System.out.println(count-1);
    }
}
