package 자바;

import java.io.*;
import java.util.*;

public class Main_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] inputList = br.readLine().split(" ");

            int[] intList = new int[3];
            for (int i=0; i<intList.length; i++) {
                intList[i] = Integer.parseInt(inputList[i]);
            }

            if (intList[0] == 0 && intList[1] == 0 && intList[2] == 0) {
                break;

            } else {
                Set<Integer> uniqueLength = new HashSet<>();

                for (int i : intList) {
                    uniqueLength.add(i);
                }
    
                int max = 0;
                int not_max_sum = 0;
                for (int i : intList) {
                    not_max_sum += i;
                    if (i > max) {
                        max = i;
                    }
                }
                not_max_sum -= max;

                if (max < not_max_sum) {
                    if (uniqueLength.size() == 1) {
                        System.out.println("Equilateral");
                    } else if (uniqueLength.size() == 2) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Scalene");
                    }
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }
}