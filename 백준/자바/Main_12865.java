package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

        int[] W = new int[N+1]; // 무게 배열
        int[] V = new int[N+1]; // 가치 배열
        int[][] dp = new int[N+1][K+1]; // 동적 프로그래밍 2차원 배열

        // 무게, 가치 담기
        for (int i=1; i<=N; i++) {
            String[] stringArr = br.readLine().split(" ");
            int[] intArr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
            W[i] = intArr[0]; // {6, 4, 3, 5}
            V[i] = intArr[1]; // {13, 8, 6, 12}
        }

        for (int i=1; i<=N; i++) { // N번 반복
            for (int j=1; j<=K; j++) { // K번 반복
                if (i == 1) { // 첫 번째 행일때 
                    if (j < W[i]) { // 최대 무게(j)가 첫 번째 품목의 무게보다 작으면
                        dp[i][j] = 0; // 넣을 수가 없으므로 0
                    } else {
                        dp[i][j] = V[i]; // 첫 번째 품목의 무게
                    }
                } else { // 첫 번째 행이 아닐때
                    if (W[i] > j) { // 품목 무게가 최대 무게(j)보다 크면
                        dp[i][j] = dp[i-1][j]; // 이전 행 복사
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]] + V[i]);
                        // 이전 행의 가치, (이전 행에서 현재 무게를 뺀 가치 + 현재 무게의 가치) 중 큰 값
                    }
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
