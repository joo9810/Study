package 자바;

import java.io.*;
import java.util.*;

public class Main_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = br.readLine().split("");

            if (input.length == 1 && input[0].equals("0")) {
                break;
            }
            String[] reverse = new String[input.length];
            for (int i=0; i<input.length; i++) {
                reverse[i] = input[input.length-1-i];
            }
            if (Arrays.equals(input, reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
