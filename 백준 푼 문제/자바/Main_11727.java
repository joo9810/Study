package 자바;

import java.io.*;
import java.math.*;

public class Main_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger[] dp = new BigInteger[n+1];

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(3);
        } else if ( n == 3) {
            System.out.println(5);
        } else {
            dp[1] = new BigInteger("1");
            dp[2] = new BigInteger("3");
            dp[3] = new BigInteger("5");
            for (int i=4; i<=n; i++) {
                dp[i] = dp[i-1].add(dp[i-2].multiply(new BigInteger("2")));
            }
            System.out.println(dp[n].remainder(new BigInteger("10007")));
        }
    }
}
