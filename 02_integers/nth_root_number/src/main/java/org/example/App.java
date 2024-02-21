package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    // TC: O(log2(n)), SC: O(1)
    static double root(double x, int n) {
        double left = 1.0;
        double right = x;
        double error = 0.001;
        while ((right - left) > error) {
            double mid = (left + right) / 2.0;
            if (multiply(mid, n) > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;
    }

    private static double multiply(double mid, int n) {
        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
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

        double result = Solution.root(x, n);

        System.out.println(result);

        bufferedReader.close();
    }
}
