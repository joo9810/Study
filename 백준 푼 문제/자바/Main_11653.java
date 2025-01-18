package 자바;

// 소인수분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int number = 2;
        ArrayList<Integer> numList = new ArrayList<>();

        if (N != 1) {
            while (true) {
                if (N % number == 0) {
                    N /= number;
                    numList.add(number);
                } else {
                    number += 1;
                }
    
                if (N == 1) {
                    break;
                }
            }
    
            for (int i : numList) {
                System.out.println(i);
            }
        }
    }
}
