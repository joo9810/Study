package 자바;

import java.io.*;
import java.util.*;

public class Main_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int bitmask = 0;

        for (int i=0; i<M; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String op = st.nextToken();
            int x = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;

            switch (op) {
                case "add":
                bitmask = bitmask | (1 << (x-1));
                break;
                case "remove":
                bitmask = bitmask & ~(1 << (x-1));
                break;
                case "check":
                bw.write(((bitmask & (1 << (x-1))) != 0 ? 1 : 0) + "\n");
                break;
                case "toggle":
                bitmask = (bitmask & (1 << (x-1))) != 0 ? bitmask & ~(1 << (x-1)) : bitmask | (1 << (x-1));
                break;
                case "all":
                bitmask = (1 << 20) - 1;
                break;
                case "empty":
                bitmask = 0;
                break;
            } 
        }
        bw.flush();
        bw.close();
    }
}

