import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        int result = 0;

        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    if (prev > 1)
                        result -= 1;
                    else
                        result += 1;
                    prev = 1;
                    break;
                case 'V':
                    if (prev > 5)
                        result -= 5;
                    else
                        result += 5;
                    prev = 5;
                    break;
                case 'X':
                    if (prev > 10)
                        result -= 10;
                    else
                        result += 10;
                    prev = 10;
                    break;
                case 'L':
                    if (prev > 50)
                        result -= 50;
                    else
                        result += 50;
                    prev = 50;
                    break;
                case 'C':
                    if (prev > 100)
                        result -= 100;
                    else
                        result += 100;
                    prev = 100;
                    break;
                case 'D':
                    if (prev > 500)
                        result -= 500;
                    else
                        result += 500;
                    prev = 500;
                    break;
                case 'M':
                    if (prev > 1000)
                        result -= 1000;
                    else
                        result += 1000;
                    prev = 1000;
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMIX"));
    }
}