package StringsAndTexts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertToNbase {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String[] input = reader.readLine().split(" ");
            byte newBase = Byte.parseByte(input[0]);
            long baseTenNumber = Long.parseLong(input[1]);
            StringBuilder newNumber = new StringBuilder();
            while (baseTenNumber > 0) {
                newNumber.append(baseTenNumber % newBase);
                baseTenNumber /= newBase;
            }
            System.out.println(newNumber.reverse());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
