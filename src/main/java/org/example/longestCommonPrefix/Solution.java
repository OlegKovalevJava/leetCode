package org.example.longestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String result = strs[0];

        for (String str : strs) {
            while (str.indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }

        return result;
    }
}