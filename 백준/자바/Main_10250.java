package 자바;

import java.io.*;
import java.util.*;

public class Main_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            int[] intInput = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            int H = intInput[0];
            int W = intInput[1];
            int N = intInput[2];

            StringBuilder strb = new StringBuilder();
            if (N % H == 0) {
                strb.append(H);
            } else {
                strb.append(N % H);
            }

            if ((int) Math.ceil((double) N / H) < 10) {
                strb.append("0");
                strb.append((int) Math.ceil((double) N / H));
            } else {
                strb.append((int) Math.ceil((double) N / H));
            }

            int result = Integer.parseInt(strb.toString());
            System.out.println(result);
        }
    }
}
