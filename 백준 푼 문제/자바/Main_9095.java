package 자바;

import java.io.*;

public class Main_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[11];

        dp[1] = 1; // 1
        dp[2] = 2; // 1+1, 2
        dp[3] = 4; // 1+1+1, 1+2, 2+1, 3
        dp[4] = 7; // 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1
        dp[5] = 13; // 1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1, 1+1+3, 1+3+1, 3+1+1, 1+2+2, 2+1+2, 2+2+1, 2+3, 3+2

        int T = Integer.parseInt(br.readLine());
        for (int i=6; i<11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }


        for (int i=0; i<T; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(dp[num]);
        }
    }
}