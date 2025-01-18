package 자바;

import java.io.*;
import java.util.*;

public class Main_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Set<String>> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            String input_word = br.readLine();
            int word_length = input_word.length();
            if (map.containsKey(word_length)) {
                map.get(word_length).add(input_word);
            } else {
                Set<String> newSet = new HashSet<>();
                newSet.add(input_word);
                map.put(word_length, newSet);
            }
        }

        // int[] sortedKeys = map.keySet().stream().mapToInt(Integer::intValue).toArray();
        List<Integer> sortedKeys2 = new ArrayList<>(map.keySet());

        Collections.sort(sortedKeys2);

        for (int num : sortedKeys2) {
            List<String> stringList = new ArrayList<>(map.get(num));
            Collections.sort(stringList);
            for (String string : stringList) {
                System.out.println(string);
            }
        }
    }
}