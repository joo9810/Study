package 자바;

import java.io.*;
import java.util.*;

public class Main_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // <String, Integer> 맵 생성
        Map<String, Integer> map = new HashMap<>();
        // 듣도 못한 사람 채우기
        for (int i=0; i<N; i++) {
            String noHear = br.readLine();
            map.put(noHear, 1);
        }

        // 보도 못한 사람 채우기
        for (int i=0; i<K; i++) {
            String noSee = br.readLine();
            if (map.containsKey(noSee)) {
                map.put(noSee, map.get(noSee) + 1);
            } else {
                map.put(noSee, 1);
            }
        }

        // 듣보잡 명단 담을 리스트
        List<String> list = new LinkedList<>();
        for (String name : map.keySet()) {
            if (map.get(name) == 2) {
                list.add(name);
            }
        }
        // 리스트 정렬
        Collections.sort(list);
        
        bw.write(list.size() + "\n");
        for(String name : list) {
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();
    }
}
