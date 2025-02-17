package 자바;

import java.io.*;

public class Main_4134 {
    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        } else if (num == 2 || num == 3) {
            return true;
        } else if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (long i=5; i*i<=num; i+=6) {
            if (num % i == 0 || num % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static long nextPrime(long num) {
        while (true) {
            if (isPrime(num)) {
                return num;
            } else {
                num += 1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long T = Long.parseLong(br.readLine());

        for (int i=0; i<T; i++) {
            long num = Long.parseLong(br.readLine());
            bw.write(nextPrime(num) + "\n");
        }

        bw.flush();
        bw.close();
    }
}