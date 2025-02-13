package 자바;

import java.io.*;
import java.util.*;

public class Main_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set<String> set = new HashSet<>();
        int currentLength = 1;
        while (currentLength <= str.length()) {
            for (int i=0; i<=str.length()-currentLength; i++) {
                String inputStr = str.substring(i, i+currentLength);
                set.add(inputStr);
            }
            currentLength += 1;
        }
        System.out.println(set.size());
    }
}