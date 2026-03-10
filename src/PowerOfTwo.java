public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(pot(16));
    }
    public static boolean pot(int n) {

        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
        //return (n&(n-1))==0;
    }

}
