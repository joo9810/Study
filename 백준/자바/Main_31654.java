package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_31654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A + B == C) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}