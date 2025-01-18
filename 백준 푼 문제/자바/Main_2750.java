package 자바;

import java.io.*;

public class Main_2750 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            int[] intArray = new int[N];

            for (int i=0; i<N; i++) {
                intArray[i] = Integer.parseInt(br.readLine());
            }

            for (int i=0; i<N-1; i++) {
                for (int j=0; j<N-i-1; j++) {
                    if (intArray[j] > intArray[j+1]) {
                        int temp = intArray[j+1];
                        intArray[j+1] = intArray[j];
                        intArray[j] = temp;
                    }
                }
            }

            for (int i : intArray) {
                System.out.println(i);
            }
        }
}