package 자바;

import java.io.*;

public class Main_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answerArray = new int[N];

        for (int i=0; i<N; i++) {
            String[] inputArray = br.readLine().split("");
            int count = 0;
            int total = 0;
            for (String s : inputArray) {
                if (s.equals("O")) {
                    count = count + 1;
                    total = total + count;
                } else {
                    count = 0;
                }
            }
            answerArray[i] = total;
        }

        for (int i : answerArray) {
            System.out.println(i);
        }
    }
}
