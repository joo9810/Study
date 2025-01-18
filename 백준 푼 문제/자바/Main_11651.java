package 자바;

import java.io.*;
import java.util.*;

public class Main_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> intArrayList = new ArrayList<>();

        for (int i=0; i<N; i++) {
            int[] inputArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            intArrayList.add(inputArray);
        }

        Collections.sort(intArrayList, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        for (int[] arr : intArrayList) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}