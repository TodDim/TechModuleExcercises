package StringsAndTexts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MerahShake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String pattern = reader.readLine();

        int firstIndex = input.indexOf(pattern);
        int lastIndex = input.lastIndexOf(pattern);
        String rem="";
        while (firstIndex >= 0 && lastIndex >= 0) {
            System.out.println("Shaked it.");
            input = input.replaceAll(pattern, "");
            rem=pattern.substring(pattern.length()/2-1,pattern.length()/2);
            pattern=pattern.replaceFirst(rem,"");

            firstIndex = input.indexOf(pattern.substring(0,1));
            lastIndex = input.lastIndexOf(pattern.substring(0,1));
            if (firstIndex < 0 || lastIndex < 0){
                firstIndex = input.indexOf(pattern.substring(pattern.length()-1,pattern.length()));
                lastIndex = input.lastIndexOf(pattern.substring(pattern.length()-1,pattern.length()));
                System.out.println("Shaked it.");
                input = input.replaceAll(pattern.substring(pattern.length()-1,pattern.length()), "");
                rem=pattern.substring(pattern.length()/2-1,pattern.length()/2);
                pattern=pattern.replaceFirst(rem,"");
                if (pattern.length()==0||(input.length()==1&&!input.contains(pattern))){
                    break;
                }
            }

        }
        System.out.println("No shake.");
        System.out.println(input);

    }
}