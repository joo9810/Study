package 자바;

import java.io.*;

public class Main_24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a1a0 = br.readLine().split(" ");
        int a1 = Integer.parseInt(a1a0[0]);
        int a2 = Integer.parseInt(a1a0[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // 모든 n >= n0에 대하여 a1*n + a0 <= c*n
        if (c>=a1 && a1*n0 + a2 <= c*n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
