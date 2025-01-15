package 자바;

import java.io.*;

public class Main_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int mok = N / 5;
        int nameji = N % 5;

        if (N >= 5) {
            if (nameji == 0) {
                System.out.println(mok);
            } else if (nameji == 3) {
                System.out.println(mok + 1);
            } else if (N >= 5 && (nameji + 5) % 3 == 0) {
                System.out.println((mok - 1) + (nameji + 5) / 3);
            } else if (N >= 10 && (nameji + 10) % 3 == 0) {
                System.out.println((mok - 2) + (nameji + 10) / 3);
            } else if (N % 3 == 0) {
                System.out.println(N / 3);
            } else {
                System.out.println(-1);
            }
        } else if (N == 3) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
