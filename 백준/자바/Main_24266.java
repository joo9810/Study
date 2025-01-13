package 자바;

import java.io.*;

public class Main_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        long n = Long.parseLong(text);

        System.out.println(n*n*n);
        System.out.println(3);
    }
}
