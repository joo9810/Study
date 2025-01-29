package 자바;

import java.io.*;

public class Main_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int currentNum = Integer.parseInt(N);
        int sumNum = 0;

        int count = 0;

        while (true) {
            if (currentNum < 10) {
                sumNum = currentNum;
            } else {
                sumNum = (currentNum / 10) + (currentNum % 10);
            }

            count += 1;

            currentNum = (currentNum % 10)*10 + (sumNum % 10);

            if (currentNum == Integer.parseInt(N)) {
                break;
            }
        }
        System.out.println(count);
    } 
}
