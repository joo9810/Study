package 자바;

import java.io.*;

public class Main_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = dp[2] + dp[3]; // 2
        dp[5] = dp[4]; // 2
        dp[6] = dp[2] + dp[5]; // 3
        dp[7] = dp[1] + dp[6]; // 4
        dp[8] = dp[3] + dp[7]; // 5
        dp[9] = dp[4] + dp[8]; // 7

        for (int i=10; i<=100; i++) {
            dp[i] = dp[i-5] + dp[i-1];
        }

        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
