package 백준.자바;

import java.io.*;

public class Main_9658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[0] = -1;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 0;
        dp[4] = 1;

        int currentIndex = 5;
        while (currentIndex <= 1000) {
            if (dp[currentIndex-1] == 0 || dp[currentIndex-3] == 0 || dp[currentIndex-4] == 0) {
                dp[currentIndex] = 1;
            } else {
                dp[currentIndex] = 0;
            }
            currentIndex += 1;
        }

        if (dp[N] == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
