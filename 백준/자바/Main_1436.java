package 자바;

import java.io.*;

public class Main_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int number = 666;
        int count = 0;

        while (true) {
            String stringNumber = String.valueOf(number);
            if (stringNumber.contains("666")) {
                count += 1;
                if (count == N) {
                    System.out.println(number);
                    break;
                }
            }
            number += 1;
        }
    }
}
