package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 국가의 수
        int K = Integer.parseInt(st.nextToken()); // 등수를 알고 싶은 국가

        int[] goldArr = new int[N];
        int[] silverArr = new int[N];
        int[] bronzeArr = new int[N];

        for (int i=0; i<N; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            goldArr[input[0]-1] = input[1];
            silverArr[input[0]-1] = input[2];
            bronzeArr[input[0]-1] = input[3];
        }

        int count = 0;
        for (int i=0; i<N; i++) {
            if (goldArr[i] > goldArr[K-1]) {
                count += 1;
            } else if (goldArr[i] == goldArr[K-1]) {
                if (silverArr[i] > silverArr[K-1]) {
                    count += 1;
                } else if (silverArr[i] == silverArr[K-1]) {
                    if (bronzeArr[i] > bronzeArr[K-1]) {
                        count += 1;
                    }
                }
            }
        }

        System.out.println(count + 1);
    }
}
