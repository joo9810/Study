package 자바;

import java.io.*;
import java.util.*;

public class Main_15964 {
    public static long calc(long A, long B) {
        return (A+B) * (A-B);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] AB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long A = AB[0];
        long B = AB[1];

        long result = calc(A, B);
        System.out.println(result);
    }
}
