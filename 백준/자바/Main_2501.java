package 자바;

// 약수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        
        String[] input = text.split(" ");
        int p = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        int number = 0;

        ArrayList<Integer> divisorList = new ArrayList<>();

        for (int i=0; i<p; i++) {
            number += 1;
            if (p % number == 0) {
                divisorList.add(number);
            }
        }

        if (divisorList.size() >= q) {
            System.out.println(divisorList.get(q-1));
        } else {
            System.out.println(0);
        }
    }
}