package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_2914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 앨범에 수록된 곡의 개수
        int I = Integer.parseInt(st.nextToken()); // 저작권이 있는 멜로디의 평균값

        System.out.println(A*(I-1) + 1);
    }
}
