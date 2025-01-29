package 자바;

import java.io.*;

public class Main_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];

        // 1 : 1^2
        // 2 : 1^2 + 1^2
        // 3 : 1^2 + 1^2 + 1^2
        // 4 : 2^2
        // 5 : 2^2 + 1^2
        // 6 : 2^2 + 1^2 + 1^2
        // 7 : 1^2 + 1^2 + 1^2 + 2^2
        // 8 : 2^2 + 2^2
        // 9 : 3^2
        // 10 : 3^2 + 1^2
        // 11 : 3^2 + 1^2 + 1^2
        // 12 : 2^2 + 2^2 + 2^2
        // 13 : 3^2 + 2^2
        // 14 : 

        if (n <= 3) {
            System.out.println(n);
        } else {
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 3;
            
            for (int i=4; i<=n; i++) {
                dp[i] = i; // 최악의 경우 (1만 더함)
                for (int j=1; j*j<=i; j++) { // 반드시 가장 가까운 제곱값이 정답에 포함된다는 보장이 없음
                    dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
                }
            }
    
            System.out.println(dp[n]);
        }
    }
}
