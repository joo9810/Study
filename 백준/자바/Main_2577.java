package 자바;

import java.io.*;
import java.util.*;

public class Main_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String[] stringResult = String.valueOf(result).split("");
        int[] intResult = Arrays.stream(stringResult).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<10; i++) {
            map.put(i, 0);
        }

        // System.out.println(map);
        // System.out.println(Arrays.toString(intResult));

        for (int i : intResult) {
                map.put(i, map.get(i)+1);
        }

        for (int i=0; i<10; i++) {
            System.out.println(map.get(i));
        }
    }
}
