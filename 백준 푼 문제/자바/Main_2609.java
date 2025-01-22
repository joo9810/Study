package 자바;

import java.io.*;
import java.util.*;

public class Main_2609 {
    public static int euclide(int A, int B) {
        if (B != 0) {
            int r = A % B;
            return euclide(B, r);
        } else {
            return A;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringInput = br.readLine().split(" ");
        int[] intInput = Arrays.stream(stringInput).mapToInt(Integer::parseInt).toArray();
        int A = intInput[0];
        int B = intInput[1];

        int r = euclide(A, B);
        int s = A * B / r;

        System.out.println(r);
        System.out.println(s);
    }
}
