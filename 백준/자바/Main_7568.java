package 자바;

import java.io.*;
import java.util.*;

public class Main_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] xArray = new int[N];
        int[] yArray = new int[N];

        for (int i=0; i<N; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            xArray[i] = input[0];
            yArray[i] = input[1];
        }

        int[] resultArray = new int[N];
        for (int i=0; i<N; i++) {
            int count = 1;
            for (int j=0; j<N; j++) {
                if (xArray[i] < xArray[j] && yArray[i] < yArray[j]) {
                    count += 1;
                }
            }
            resultArray[i] = count;
        }
        
        for (int i=0; i<N; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
