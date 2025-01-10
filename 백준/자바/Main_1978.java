package 자바;

// 소수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] array = br.readLine().split(" ");

        int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> primeList = new ArrayList<>();
        
        if (N == intArray.length) {
            for (int i : intArray) {
                ArrayList<Integer> divisorList = new ArrayList<>();
                for (int j=1; j<i; j++) {
                    if (i % j == 0) {
                        divisorList.add(j);
                    }
                }
                if (divisorList.size() == 1 && divisorList.get(0) == 1) {
                    primeList.add(i);
                }
            }
    
            System.out.println(primeList.size());
        }
    }
}
