package 자바;

import java.io.*;

public class Main_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        long n = Long.parseLong(text);

        System.out.println((long) Math.pow(n, 2));
        System.out.println(2);
    }
}
