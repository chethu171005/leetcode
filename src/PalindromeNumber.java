public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        int reverse=0;
        int n=x;
        while(x>0)
        {
            int rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;
        }
        if(n==reverse)
            return true;
        else
            return false;
    }
}
