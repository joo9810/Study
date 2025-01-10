package 자바;

// 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i=M; i<=N; i++) {
            ArrayList<Integer> divisorList = new ArrayList<>();

            for (int j=1; j<i; j++) {
                if (i % j == 0) {
                    divisorList.add(j);
                }
            }

            if (divisorList.size() == 1 && divisorList.get(0) == 1 ) {
                primeList.add(i);
            }
        }

        int sum = primeList.stream().mapToInt(Integer::intValue).sum();

        if (primeList.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(primeList.get(0));
        }
    }
}
