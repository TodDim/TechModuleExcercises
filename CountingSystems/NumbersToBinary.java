package CountingSystems;

public class NumbersToBinary {
    public static void main(String a[]) {

        System.out.println("Binary representation of 124: ");
        System.out.println(Integer.toBinaryString(124));

        System.out.println("Binary representation of -0.41: ");
        long bits = Double.doubleToLongBits(-0.41);
        System.out.println(Long.toBinaryString(bits));

        System.out.println("Double 21.15625d to binary: ");
        long numberLong = Double.doubleToLongBits(-21.15625);
        System.out.println(Long.toBinaryString(numberLong));

        System.out.println("Float 21.15625f to binary: ");
        int number = Float.floatToIntBits(-21.15625f);
        System.out.println(Integer.toBinaryString(number));

        System.out.println("Decimal representation of 1111010110011110: ");
        System.out.println(Integer.parseInt("1111010110011110", 2));

        System.out.println("Hexidecimal representation of 1111010110011110: ");
        System.out.println(Long.toHexString(Long.parseLong("1111010110011110",2)));

        System.out.println("Binary representation of 2A3E: ");
        System.out.println(Integer.toBinaryString(Integer.parseInt("2A3E", 16)));
    }
}
