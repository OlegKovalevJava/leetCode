package org.example.palindromeNumber;
//Given an integer x, return true if x is a palindrome
//and false otherwise.
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. it is not a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        int palindrome = x;

        if (x < 0) {
            return false;
        }

        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return x == reverse;
    }
}
