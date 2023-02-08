public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";

        if (strs.length == 1) {
            prefix = strs[0];
        } else {
            String world = strs[0];
            String prefWorld = "";

            for (int w = 0; w < world.length(); w++) {
                prefWorld += world.charAt(w);
                Boolean breakFlag = false;

                for (int j = 1; j < strs.length; j++) {
                    String world2 = strs[j];
                    String prefWorld2 = "";

                    for (int p = 0; p < w + 1; p++) {
                        if (w + 1 <= world2.length())
                            prefWorld2 += world2.charAt(p);
                        else {
                            breakFlag = true;
                            break;
                        }

                    }

                    if (prefWorld2.equals(prefWorld)) {
                        if (j + 1 == strs.length)
                            prefix = prefWorld;
                    } else {
                        breakFlag = true;
                        break;
                    }
                }

                if (breakFlag) break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
//        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }
}
