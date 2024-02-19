package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    public static boolean isPalindrome(int x) {
        // if the number is a negative number
        // if the number end with 0 except the number zero
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            int lastDigit = x % 10;
            revertedNumber = revertedNumber * 10 + lastDigit;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine());

        boolean result = Solution.isPalindrome(num);

        System.out.println(result);

        bufferedReader.close();
    }
}
