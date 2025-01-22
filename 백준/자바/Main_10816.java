package 자바;

import java.io.*;
import java.util.*;

public class Main_10816 {
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
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        for (int j : arr2) {
            if (map.containsKey(j)) {
                bw.write(map.get(j) + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
