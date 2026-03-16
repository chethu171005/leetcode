import java.util.Arrays;

public class ConvertNumToHex {
    public static void main(String[] args) {
        System.out.println(toHex(26));
    }
    public static String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int digit = num & 15;   // get last 4 bits
            result.append(hex[digit]);
            num >>>= 4;             // unsigned right shift
        }

        return result.reverse().toString();
    }
}
