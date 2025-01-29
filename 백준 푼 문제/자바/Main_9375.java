package 자바;

import java.io.*;
import java.util.*;

public class Main_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            Map<String, List<String>> map = new HashMap<>();
            for (int j=0; j<m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                if (map.containsKey(type)) {
                    map.get(type).add(name);
                } else {
                    List<String> inputList = new ArrayList<>();
                    inputList.add(name);
                    map.put(type, inputList);
                }
            }

            int result = 1;
            for (String j : map.keySet()) {
                result *= map.get(j).size() + 1;
            }

            System.out.println(result - 1);
        }
    }
}
