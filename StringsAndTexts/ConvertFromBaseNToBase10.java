package StringsAndTexts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConvertFromBaseNToBase10 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] input = removeEmptyEntries(reader.readLine().split("\\s+"));

            byte BaseN = Byte.parseByte(input[0]);
            long baseNNumber = Long.parseLong(input[1]);
            long sum=0;
            int index=0;
            while (baseNNumber > 0) {
                sum+=baseNNumber%10*Math.pow(BaseN,index);
                index++;
                baseNNumber /= 10;
            }
            System.out.println(sum);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static String[] removeEmptyEntries (String[] collection){
        ArrayList<String> nonEmpty = new ArrayList<String>();
        for (String o : collection) {
            if (o.length() > 0) {
                nonEmpty.add(o);
            }
        }
        String[] results=new String[nonEmpty.size()];
        for (int i = 0; i < results.length; i++) {
            results[i]=nonEmpty.get(i);
        }
        return results;
    }
}

