package 자바;

import java.io.*;
import java.util.*;

public class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            int inputValue = Integer.parseInt(br.readLine());
            if (map.containsKey(inputValue) == true) {
                map.put(inputValue, map.get(inputValue) + 1);
            } else {
                map.put(inputValue, 1);
            }
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        
        Collections.sort(keyList);

        for (int i : keyList) {
            for (int j=0; j<map.get(i); j++) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
