public class Solution {
    public static int lengthOfLastWord(String s) {
        int size = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (flag) {
                    size = 0;
                    flag = false;
                }
                size++;
            } else {
                flag = true;
            }
        }

        return size;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
