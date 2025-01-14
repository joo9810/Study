package 자바;

import java.io.*;

public class Main_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            int splitSum = 0;

            String stringNum = String.valueOf(i);
            for (int j=0; j<stringNum.length(); j++) {
                splitSum += Integer.parseInt(String.valueOf(stringNum.charAt(j)));
            }

            if (i + splitSum == N) {
                System.out.println(i);
                break;
            } else if (i == N-1) {
                System.out.println(0);
            }
        }
    }
}
