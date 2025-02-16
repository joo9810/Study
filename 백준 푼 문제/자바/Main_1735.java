package 자바;

import java.io.*;
import java.util.*;

public class Main_1735 {
    public static long euclid(long A, long B) {
        long remainder = A % B;
        if (remainder != 0) {
            return euclid(B, remainder);
        } else {
            return B;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long C = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        long bunmo = B * D;
        long bunja = (A*D) + (C*B);

        while (true) {
            long result = euclid(bunja, bunmo);
            if (result != 1) {
                bunmo /= result;
                bunja /= result;
            } else {
                break;
            }
        }

        System.out.println(bunja + " " + bunmo);
    }
}