package 자바;

import java.io.*;
import java.util.*;

public class Main_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전의 종류
        int K = Integer.parseInt(st.nextToken()); // 만들어야 할 동전의 가치

        int[] coinArr = new int[N]; // 동전의 종류를 담을 배열
        for (int i=0; i<N; i++) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }

        int remainValue = K;
        int count = 0;
        for (int i=coinArr.length-1; i>=0; i--) {
            int currentCoin = coinArr[i];
            if (remainValue >= currentCoin) {
                count += remainValue / currentCoin;
                remainValue %= currentCoin;
            }
        }

        System.out.println(count);
    }
}
