package org.example.romanToInteger;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] arr = s.toCharArray();
        int arabianNumber;
        int result = map.get(arr[s.length() - 1]);

        for (int i = (s.length() - 1) - 1; i >= 0; i--) {
            arabianNumber = map.get(arr[i]);

            if (arabianNumber < map.get(arr[i + 1])) {
                result -= arabianNumber;
            } else {
                result += arabianNumber;
            }
        }

        return result;
    }
}