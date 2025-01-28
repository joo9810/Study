package 자바;

import java.io.*;
import java.util.*;

public class Main_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, int[]> dpMap = new HashMap<>();

        int[] fib0Arr = {1, 0};
        int[] fib1Arr = {0, 1};

        dpMap.put(0, fib0Arr);
        dpMap.put(1, fib1Arr);

        for (int i=2; i<=40; i++) {
            int[] inputArr = {dpMap.get(i-1)[0] + dpMap.get(i-2)[0], dpMap.get(i-1)[1] + dpMap.get(i-2)[1]};
            dpMap.put(i, inputArr);
        }

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(dpMap.get(num)[0] + " " + dpMap.get(num)[1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
