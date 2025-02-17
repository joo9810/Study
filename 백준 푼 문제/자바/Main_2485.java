package 자바;

import java.io.*;

public class Main_2485 {
    public static int euclid(int A, int B) {
        int remainder = A % B;
        if (remainder != 0) {
            return euclid(B, remainder);
        } else {
            return B;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] diffArr = new int[N-1];

        int before = Integer.parseInt(br.readLine());
        for (int i=0; i<N-1; i++) {
            int after = Integer.parseInt(br.readLine());

            diffArr[i] = after - before;
            before = after;
        }

        int result = euclid(diffArr[0], diffArr[1]);
        for (int i=2; i<diffArr.length; i++) {
            result = euclid(result, diffArr[i]);
        }

        int count = 0;
        for (int i : diffArr) {
            count += (i / result) - 1;
        }

        System.out.println(count);
    }
}