package 자바;

import java.io.*;
import java.util.*;

public class Main_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, List<String>> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            String[] inputAgeName = br.readLine().split(" ");
            Integer age = Integer.parseInt(inputAgeName[0]);
            String name = inputAgeName[1];

            // System.out.println(age);
            // System.out.println(name);

            if (map.containsKey(age)) {
                map.get(age).add(name);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(name);
                map.put(age, newList);
            }
        }

        // System.out.println(map);

        List<Integer> sortedKey = new ArrayList<>(map.keySet());
        Collections.sort(sortedKey);

        for (int age : sortedKey) {
            List<String> nameList = new ArrayList<>(map.get(age));
            for (String name : nameList) {
                System.out.println(age + " " + name);
            }
        }
    }
}
