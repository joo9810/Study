package 자바;

import java.io.*;
import java.util.*;

public class Main_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 최대 500000
        int[] havingNumArr = new int[N];
        havingNumArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine()); // 최대 500000
        int[] checkNumArr = new int[M];
        checkNumArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(havingNumArr); // 이분 탐색을 위한 정렬

        for (int i=0; i<M; i++) {
            int currentNum = checkNumArr[i];

            int left = 0;
            int right = N-1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int havingNum = havingNumArr[mid];
                if (currentNum == havingNum) {
                    bw.write(1 + " ");
                    break;
                } else if (currentNum > havingNum) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left > right) {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}