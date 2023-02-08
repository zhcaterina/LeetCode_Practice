public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            int num = x;
            int rev = 0;

            while (x != 0) {
                int number = x % 10;

                rev = rev * 10 + number;

                x = x / 10;
            }

            return (rev == num);
        } else {
            return false;
        }
    }
}
