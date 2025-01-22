package 자바;

import java.io.*;

public class Main_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i=1; i<N+1; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
