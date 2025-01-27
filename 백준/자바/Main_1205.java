package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken()); // 리스트에 있는 점수 개수
        int newScore = Integer.parseInt(st.nextToken()); // 태수의 새로운 점수
        int P = Integer.parseInt(st.nextToken()); // 랭킹 리스트에 올라갈 수 있는 점수 개수

        int[] rankingBoard = new int[P];

        // 랭킹 보드에 기존 점수들 채우기
        if (N > 0) {
            StringTokenizer scoreSt = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                rankingBoard[i] = Integer.parseInt(scoreSt.nextToken());
            }
        }

        // 태수의 점수를 기존 점수들과 비교하기
        int rank = 0;
        for (int i : rankingBoard) {
            if (newScore < i) {
                rank += 1;
            }
        }

        // 랭킹 보드의 최솟값
        int minScore = Arrays.stream(rankingBoard).min().getAsInt();
        if (newScore <= minScore && minScore != 0) {
            System.out.println(-1);
        } else {
            System.out.println(rank+1);
        }
    }
}