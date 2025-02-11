package 자바;

import java.io.*;
import java.util.*;

public class Main_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Map<Character, List<String>> map = new HashMap<>();
        for (int i=0; i<N; i++) { // 1000000번
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            char firstChar = name.charAt(0);

            if (state.equals("enter")) {
                if (map.containsKey(firstChar)) {
                    map.get(firstChar).add(name);
                } else {
                    List<String> inputList = new ArrayList<>();
                    inputList.add(name);
                    map.put(firstChar, inputList);
                }
            } else {
                map.get(firstChar).remove(name);
            }
        }

        List<Character> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (int i=keyList.size()-1; i>=0; i--) {
            Collections.sort(map.get(keyList.get(i)));
            for (int j=map.get(keyList.get(i)).size()-1; j>=0; j--) {
                bw.write(map.get(keyList.get(i)).get(j) + "\n");
            }
        }
         bw.flush();
         bw.close();
    }
}