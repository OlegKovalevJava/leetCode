package org.example.validParenthesis;

class Solution {
    public boolean isValid(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }

    public boolean isValid2(String s) { // не будет работать для такого примера: "{[]}"
        if (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }
}