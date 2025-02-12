package 자바;

import java.io.*;
import java.util.*;

public class Main_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];

        A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(B);

        int intersect = 0;
        for (int i=0; i<N; i++) {
            int left = 0;
            int right = M-1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (B[mid] == A[i]) {
                    intersect += 1;
                    break;
                } else if (B[mid] > A[i]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        System.out.println(A.length + B.length - 2*intersect);
    }
}