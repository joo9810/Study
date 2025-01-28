package 자바;

import java.io.*;
import java.util.*;

public class Main_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distanceArr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] priceArr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        // 내가 지금 있는 주유소보다 더 싼 주유소까지 갈 만큼 넣는다
        int currentStationIndex = 0;
        long total = 0;
        int count = 1;
        while (currentStationIndex != N-1) {
            if (priceArr[currentStationIndex] > priceArr[currentStationIndex + count] || currentStationIndex + count == N-1) {
                long[] distanceSumArr = Arrays.copyOfRange(distanceArr, currentStationIndex, currentStationIndex+count);
                total += priceArr[currentStationIndex]*Arrays.stream(distanceSumArr).sum();
                currentStationIndex += count;
                count = 1;
            } else {
                count += 1;
            }
        }

        System.out.println(total);
    }
}