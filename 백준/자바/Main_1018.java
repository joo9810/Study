package 자바;

import java.io.*;
import java.util.*;

public class Main_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] text = br.readLine().split(" ");
        int[] MN = Arrays.stream(text).mapToInt(Integer::parseInt).toArray();
        int M = MN[0];
        int N = MN[1];

        char[] whiteStartPattern = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        char[] blackStartPattern = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};

        char[][] whiteStartBoard = new char[8][8];
        char[][] blackStartBoard = new char[8][8];

        // 흰색, 검은색 시작 체스판 각각 만들기
        for (int i=0; i<8; i++) {
            if (i % 2 == 0) {
                whiteStartBoard[i] = whiteStartPattern;
                blackStartBoard[i] = blackStartPattern;
            } else {
                whiteStartBoard[i] = blackStartPattern;
                blackStartBoard[i] = whiteStartPattern;
            }
        }

        // System.out.println(Arrays.deepToString(whiteStartBoard));
        // System.out.println(Arrays.deepToString(blackStartBoard));

        // 입력 체스판 만들기
        char[][] inputBoard = new char[M][N];
        for (int i=0; i<M; i++) {
            String colorText = br.readLine();
            for (int j=0; j<N; j++) {
                inputBoard[i][j] = colorText.charAt(j);
            }
        }

        // System.out.println(Arrays.deepToString(inputBoard));

        // 비교 체스판 만들기
        char[][] compareBoard = new char[8][8];
        List<Integer> diffColorCountList = new ArrayList<>();
        for (int i=0; i<M-7; i++) {
            for (int j=0; j<N-7; j++) {
                for (int k=0; k<8; k++) {
                    compareBoard[k] = Arrays.copyOfRange(inputBoard[i+k], j, j+8);
                }

                // System.out.println(Arrays.deepToString(compareBoard));

                // 체스판 비교
                int whiteBoardDiffColor = 0;
                int blackBoardDiffColor = 0;
                for (int a=0; a<8; a++) {
                    for (int b=0; b<8; b++) {
                        if (whiteStartBoard[a][b] != compareBoard[a][b]) {
                            whiteBoardDiffColor += 1;
                        } else if (blackStartBoard[a][b] != compareBoard[a][b]) {
                            blackBoardDiffColor += 1;
                        }
                    }
                }

                diffColorCountList.add(whiteBoardDiffColor);
                diffColorCountList.add(blackBoardDiffColor);
            }
        }

        System.out.println(Collections.min(diffColorCountList));
    }
}