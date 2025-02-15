package 자바;

import java.io.*;
import java.util.*;

public class Main_13241 {
    public static long euclid(long A, long B) {
        long remainder = A % B;
        if (remainder != 0) {
            return euclid(B, remainder);
        } else {
            return B;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(A * B / euclid(A, B));
    }
}