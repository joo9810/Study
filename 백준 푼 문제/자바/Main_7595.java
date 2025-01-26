package 자바;

import java.io.*;

public class Main_7595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            } else {
                for (int i=1; i<=input; i++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j=0; j<i; j++) {
                        sb.append("*");
                    }
                    bw.write(sb.toString() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
