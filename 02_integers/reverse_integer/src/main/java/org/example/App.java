package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    // TC: O(log(n)), SC: O(1)
    public static int reverse(int x) {
        int reversed = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while (x != 0) {
            int lastDigit = x % 10;

            if (reversed > max / 10 || (reversed == max / 10 && lastDigit > 7)) {
                return 0;
            }

            if (reversed < min / 10 || (reversed == min / 10 && lastDigit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + lastDigit;

            x = x / 10;
        }

        return reversed;
    }
}

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String num = bufferedReader.readLine();

        int result = Solution.reverse(Integer.parseInt(num));

        System.out.println(result);

        bufferedReader.close();
    }
}
