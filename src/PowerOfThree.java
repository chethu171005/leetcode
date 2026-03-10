public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(pot(1));
    }
    public static boolean pot(int n) {

//        if (n <= 0) return false;
//
//        while (n % 3 == 0) {
//            n = n / 3;
//        }
//
//        return n == 1;
        return n > 0 && 1162261467 % n == 0;
    }
}
