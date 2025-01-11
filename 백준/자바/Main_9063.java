package 자바;

import java.io.*;
import java.util.*;

public class Main_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();

        for (int i=0; i<N; i++) {
            String[] stringArray = br.readLine().split(" ");
            int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();

            xList.add(intArray[0]);
            yList.add(intArray[1]);
        }

        int minX = Collections.min(xList);
        int maxX = Collections.max(xList);
        int minY = Collections.min(yList);
        int maxY = Collections.max(yList);

        int xLength = maxX - minX;
        int yLength = maxY - minY;

        System.out.print(xLength * yLength);
    }
}
