package 자바;

import java.io.*;
import java.util.*;

public class Main_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputList = new ArrayList<>();

        for (int i=0; i<3; i++) {
            inputList.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        Set<Integer> uniqueAngle = new HashSet<>();

        for (int i : inputList) {
            sum += i;
            uniqueAngle.add(i);
        }

        if (sum == 180) {
            if (uniqueAngle.size() == 1) {
                System.out.print("Equilateral");
            } else if (uniqueAngle.size() == 2) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }
    }
}