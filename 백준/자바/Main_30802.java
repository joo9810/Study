package 자바;

import java.io.*;
import java.util.*;

public class Main_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        String[] TP = br.readLine().split(" ");
        int T = Integer.parseInt(TP[0]);
        int P = Integer.parseInt(TP[1]);

        int TCount = 0;
        for (int i : intArray) {
            TCount += Math.ceil((double) i/T);
        }

        int PCount1 = N / P;
        int PCount2 = N % P;
        
        System.out.println(TCount);
        System.out.println(PCount1 + " " + PCount2);
    }
}
