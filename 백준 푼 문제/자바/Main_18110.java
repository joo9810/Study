package 자바;

import java.io.*;
import java.util.*;

public class Main_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
        } else {
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            // 오름차순 정렬
            Arrays.sort(arr);
    
            int cutCount = (int) Math.round(n * 0.15);
            int[] arr2 = Arrays.copyOfRange(arr, cutCount, n-cutCount);
            int result = (int) Math.round(Arrays.stream(arr2).average().getAsDouble());
            System.out.println(result);
        }
    }
}
