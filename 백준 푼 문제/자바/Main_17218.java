package 자바;

import java.io.*;

public class Main_17218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int N = str1.length();
        int M = str2.length();

        int[][] dp = new int[N+1][M+1];
        String[][] strArr = new String[N+1][M+1];
        for (int i=0; i<=N; i++) {
            for (int j=0; j<=M; j++) {
                strArr[i][j] = "";
            }
        }

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=M; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    // 이전 행(i-1)의 이전 열(j-1)까지의 사각형 배열 범위 중 최댓값 탐색
                    int max = 0;
                    String tempArr = "";
                    for (int a=1; a<i; a++) {
                        for (int b=1; b<j; b++) {
                            if (dp[a][b] > max) {
                                max = dp[a][b];
                                tempArr = strArr[a][b];
                            }
                        }
                    }
                    dp[i][j] = max + 1;
                    strArr[i][j] = tempArr + str1.substring(i-1, i);
                }
            }
        }
        String result = "";
        for (String[] sArr : strArr) {
            for (String s : sArr) {
                if (result.length() < s.length()) {
                    result = s;
                }
            }
        }
        System.out.println(result);
    }
}
// SETAPPLE 
// E A T M A N Y
// 0 0 0 0 0 0 0
// 1 0 0 0 0 0 0
// 0 0 2 0 0 0 0
// 0 2 0 0 3 0 0
// 0 0 0 0 0 0 0
// 0 0 0 0 0 0 0
// 0 0 0 0 0 0 0
// 1 0 0 0 0 0 0
