package 자바;

import java.io.*;
import java.util.*;

public class Main_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] MN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = MN[0];
        int N = MN[1];
        int max = 1000000;
        int[] primeArr = new int[max+1];
        for (int i=0; i<primeArr.length; i++) {
            primeArr[i] = 1;
        }
        // 0과 1은 소수가 아님
        primeArr[0] = 0;
        primeArr[1] = 0;

        for (int i=2; i<=Math.sqrt(max); i++) {
            if (primeArr[i] == 1) {
                for (int j=i*i; j<=max; j += i) {
                    primeArr[j] = 0;
                }
            }
        }

        for (int i=M; i<=N; i++) {
            if (primeArr[i] == 1) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
