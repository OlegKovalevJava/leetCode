package org.example.longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        String b = solution.longestCommonPrefix(new String[]{"dog", "dog", "do"});
        String c = solution.longestCommonPrefix(new String[]{"root", "ro", "r"});

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}