package 자바;

// 배수와 약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String text = br.readLine();
            
            String[] list = text.split(" ");
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);

            if (a == 0 && b == 0) break;

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
