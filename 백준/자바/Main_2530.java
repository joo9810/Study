package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int inputSecond = Integer.parseInt(br.readLine());

        int outputSecond = (second + inputSecond) % 60;
        int outputMinute = (minute + ((second + inputSecond) / 60)) % 60;
        int outputHour = (hour + ((minute + ((second + inputSecond) / 60)) / 60)) % 24;

        System.out.println(outputHour + " " + outputMinute + " " + outputSecond);
    }
}
