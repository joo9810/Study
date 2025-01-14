package 자바;

import java.io.*;

public class Main_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMArray = br.readLine().split(" ");
        int N = Integer.parseInt(NMArray[0]);
        int M = Integer.parseInt(NMArray[1]);
        String[] numArray = br.readLine().split(" ");

        // 문자형 배열은 정수형 배열로 변환
        int[] intArray = new int[N];
        for (int i=0; i<N; i++) {
            intArray[i] = Integer.parseInt(numArray[i]);
        }

        // nC3 조합의 경우의 수
        int maxSum = 0;
        for (int i=0; i<intArray.length-2; i++) {
            for (int j=i+1; j<intArray.length-1; j++) {
                for (int k=j+1; k<intArray.length; k++) {
                    int sum = intArray[i] + intArray[j] + intArray[k];
                    if (sum > maxSum && sum <= M) {
                        maxSum = sum;
                    }
                }
            }
        }

        // 출력
        System.out.println(maxSum);
    }
}