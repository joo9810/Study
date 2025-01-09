package 자바;

// 중앙 이동 알고리즘

import java.util.Scanner;

public class Main_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 2;
        int result;
    
        for (int i=0; i<N; i++) {
            a = a + (a-1);
        }

        result = (int) Math.pow(a, 2);
    
        System.out.println(result);
    }
}
