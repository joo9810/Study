package 자바;

import java.io.*;
import java.math.*;

public class Main_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(1);
        } else {
            BigInteger[] dp = new BigInteger[N+1];

            dp[1] = new BigInteger("1");
            dp[2] = new BigInteger("2");
            for (int i=3; i<=N; i++) {
                dp[i] = dp[i-1].add(dp[i-2]);
            }
    
            BigInteger divideNum = new BigInteger("10007");
    
            System.out.println(dp[N].remainder(divideNum));
        }
    }
}
