package DataTypesAndVariables;

import java.time.Duration;
import java.util.Scanner;

/**
 * Created by tydimitrov on 3.10.2017 г..
 */

public class TheaThePhotographer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long FT = scanner.nextLong();
        double FF = scanner.nextDouble()/100;
        long UT = scanner.nextLong();
        if (FF >= 0 && FF <= 100&&N>=0&&FT>=0&&UT>=0) {

            double filteredPictures = Math.ceil(FF * N );
            long filterTimeAllPictures = N * FT;
            long uploadTimeForAllFilteredPictures = (int) filteredPictures * UT;
            long timeForFilterAllPicture = N * FT;
            long allTime = uploadTimeForAllFilteredPictures + timeForFilterAllPicture;

            long days = 0;
            long hours = 0;
            long minutes = 0;
            long seconds = 0;

            days += allTime / 86400;
            allTime -= days * 86400;
            hours += allTime / 3600;
            allTime -= hours * 3600;
            minutes += allTime / 60;
            allTime -= minutes * 60;
            seconds += allTime;

            System.out.printf("%d:%02d:%02d:%02d%n", days, hours, minutes, seconds);
        }
    }
}