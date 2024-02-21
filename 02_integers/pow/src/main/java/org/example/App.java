package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    // TC: O(log(n)), SC: O(1)
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if (n < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            return (double) (1.0) / (double) (ans);
        }
        return ans;
    }
}

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("x: ");
        double x = Double.parseDouble(bufferedReader.readLine());
        System.out.print("n: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        double result = Solution.myPow(x, n);

        System.out.println(result);

        bufferedReader.close();
    }
}
