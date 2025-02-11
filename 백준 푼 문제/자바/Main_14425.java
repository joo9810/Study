package 자바;

import java.io.*;
import java.util.*;

public class Main_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Character, List<String>> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            String inputStr = br.readLine();
            char firstChar = inputStr.charAt(0);
            if (map.containsKey(firstChar)) {
                map.get(firstChar).add(inputStr);
            } else {
                List<String> inputList = new ArrayList<>();
                inputList.add(inputStr);
                map.put(firstChar, inputList);
            }
        }

        int count = 0;
        for (int i=0; i<M; i++) {
            String inspectStr = br.readLine();
            char firstChar = inspectStr.charAt(0);
            if (map.containsKey(firstChar) && map.get(firstChar).contains(inspectStr)) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}