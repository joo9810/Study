package 자바;

import java.io.*;
import java.util.*;

public class Main_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int result = 0;
        for (int i=0; i<N; i++) {
            result += (arr[i] * (N-i));
        }

        System.out.println(result);
    }
}