package 백준.자바;

import java.io.*;

public class Main_18238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] charArr = str.toCharArray();

        int move = 0;
        char currentChar = 'A';
        for (char c : charArr) {
            int currentAscii = (int) currentChar;
            int nextAscii = (int) c;
            int distance = Math.abs(nextAscii - currentAscii);
            if (distance <= 13) {
                move += distance;
            } else {
                move += (26 - distance);
            }
            currentChar = c;
        }

        System.out.println(move);
    }
}
