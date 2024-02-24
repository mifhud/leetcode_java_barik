package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    // TC: O(n), SC: O(n)
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (set.contains(substring)) {
                list.add(substring);
            } else {
                set.add(substring);
            }
        }
        return new ArrayList<>(list);
    }
}

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String ar = bufferedReader.readLine();

        List<String> repeatedDnaSequences = Solution.findRepeatedDnaSequences(ar);

        System.out.println(repeatedDnaSequences);

        bufferedReader.close();
    }
}
