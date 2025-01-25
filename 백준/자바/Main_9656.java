package 백준.자바;

import java.io.*;

public class Main_9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        // 본인 턴 기준 승패 여부
        dp[0] = -1; // 아무 것도 아님
        dp[1] = 0; // 패배
        dp[2] = 1; // 승리
        dp[3] = 0; // 패배

        int currentIndex = 4;
        while(currentIndex <= 1000) {
            if (dp[currentIndex-1] == 0 || dp[currentIndex-3] == 0) { // 상대턴으로 넘긴 상황에서 -1과 -3중 하나라도 패배일 경우
                dp[currentIndex] = 1; // 내가 승리
            } else { // 아니라면
                dp[currentIndex] = 0; // 내가 패배
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
