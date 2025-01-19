package 자바;

import java.io.*;
import java.util.*;

public class Main_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[] beforeFloor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
            int[] afterFloor = new int[14];
            int floor = 0;
            while (true) {
                floor += 1;
                for (int j=0; j<14; j++) {
                    int[] sumArray = Arrays.copyOfRange(beforeFloor, 0, j+1);
                    afterFloor[j] = Arrays.stream(sumArray).sum();
                }
                if (floor == k) {
                    break;
                } else {
                    beforeFloor = Arrays.copyOfRange(afterFloor, 0, 14);
                }
            }
            System.out.println(afterFloor[n-1]);
        }
    }
}