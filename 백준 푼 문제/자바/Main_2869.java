package 자바;

// 달팽이는 올라가고 싶다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        String[] list = text.split(" ");
        int A = Integer.parseInt(list[0]);
        int B = Integer.parseInt(list[1]);
        int V = Integer.parseInt(list[2]);

        int total_minus_one_day =  (int) Math.ceil((double) (V - A) / (A - B));

        System.out.println(total_minus_one_day + 1);
    }
}
