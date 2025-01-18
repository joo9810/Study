package 자바;

import java.io.*;
import java.util.*;

public class Main_2475 {
    public static int method(int[] intArray) {
        int result = 0;
        for (int i : intArray) {
            result += (Math.pow(i, 2));
        }
        result %= 10;
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();

        System.out.println(method(intArray));
    }
}
