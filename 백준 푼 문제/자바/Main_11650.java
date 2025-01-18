package 자바;

import java.io.*;
import java.util.*;

public class Main_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<int[]> intArrayList = new ArrayList<>();
        for (int i=0; i<N; i++) {
            intArrayList.add(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        }

        Collections.sort(intArrayList, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int[] arr : intArrayList) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}