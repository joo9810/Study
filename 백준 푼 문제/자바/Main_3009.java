package 자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input3 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] x = {input1[0], input2[0], input3[0]};
        int[] y = {input1[1], input2[1], input3[1]};

        int minX = Arrays.stream(x).min().getAsInt();
        int maxX = Arrays.stream(x).max().getAsInt();
        int minY = Arrays.stream(y).min().getAsInt();
        int maxY = Arrays.stream(y).max().getAsInt();

        int[] leftTop = {minX, maxY};
        int[] leftBottom = {minX, minY};
        int[] rightTop = {maxX, maxY};
        int[] rightBottom = {maxX, minY};

        int[][] inputVertexList = {input1, input2, input3};
        int[][] resultVertexList = {leftTop, leftBottom, rightTop, rightBottom};

        boolean exist;

        for (int[] i : resultVertexList) {

            exist = false;

            for (int[] j : inputVertexList) {
                if (Arrays.equals(i, j)) {
                    exist = true;
                    break;
                }
            }

            if (exist == false) {
                System.out.println(i[0] + " " + i[1]);
            }
        }
    }
}