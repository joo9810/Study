package 자바;

import java.io.*;
import java.util.*;

public class Main_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] KN = br.readLine().split(" ");
        int K = Integer.parseInt(KN[0]);
        int N = Integer.parseInt(KN[1]);

        int[] arr = new int[K];
        for (int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = Arrays.stream(arr).max().getAsInt();

        long left = 1;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            int total = 0;

            for (int length : arr) {
                total += length / mid;
            }

            if (total >= N) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}

