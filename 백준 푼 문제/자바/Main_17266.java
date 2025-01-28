package 자바;

import java.io.*;
import java.util.*;

public class Main_17266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] positionArr = new int[M];
        positionArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int left = 0; // 좌측 탐색 시작 지점 0
        int right = N; // 우측 탐색 시작 지점 N
        int lightHeight = 0;
        int result = 0;

        while (left <= right) {
            int covered = 0;
            lightHeight = (left + right) / 2;
            for (int position : positionArr) {
                if (position - lightHeight <= covered) {
                    covered = position + lightHeight;
                } else {
                    break;
                }
                
            }

            if (covered >= N) {
                result = lightHeight;
                right = lightHeight - 1;
            } else {
                left = lightHeight + 1;
            }
        }
        System.out.println(result);
    }
}
