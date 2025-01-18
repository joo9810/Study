package 자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String[] stringList = text.split(" ");
        int[]  intList = Arrays.stream(stringList).mapToInt(Integer::parseInt).toArray();

        int x = intList[0];
        int y = intList[1];
        int w = intList[2];
        int h = intList[3];

        int[] resultList = {x, w - x, h - y, y};
        int min = Integer.MAX_VALUE;
        for (int i : resultList) {
            if (i < min) {
                min = i;
            }
        }

        System.out.print(min);
    }
}
