package 자바;

import java.io.*;
import java.util.*;

public class Main_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            map.put(i, 1);
        }
        for (int j : arr2) {
            if (map.get(j) == null) {
                bw.write(0 + "\n");
            } else {
                bw.write(1 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}