package SoftuniExam;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 17.9.2017 г..
 */
public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float firstBrotherTime = scanner.nextFloat();
        float secondBrotherTime = scanner.nextFloat();
        float thirdBrotherTime = scanner.nextFloat();
        float fishingTimeFather = scanner.nextFloat();
        if ((firstBrotherTime >= 0.0f) && (secondBrotherTime >= 0.0f) && (thirdBrotherTime >= 0.0f) && (fishingTimeFather >= 0.0f) && (firstBrotherTime <= 99.0f) && (secondBrotherTime <= 99.0f) && (thirdBrotherTime <= 99.0f) && (fishingTimeFather <= 99.0f)) {

            double time = 1 / (1 / firstBrotherTime + 1 / secondBrotherTime + 1 / thirdBrotherTime);
            double timeWithPause = time * 1.15;
            double left = fishingTimeFather - timeWithPause;
            double modLeft = Math.abs(left);
            double ceil = Math.ceil(modLeft);
            if (left > 0) {
                System.out.printf("Cleaning time: %.2f%n", timeWithPause);
                System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", left);
            } else {
                System.out.printf("Cleaning time: %.2f%n", timeWithPause);
                System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", ceil);
            }
        }
    }
}