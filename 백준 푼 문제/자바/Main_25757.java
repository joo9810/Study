package 자바;

import java.io.*;
import java.util.*;

public class Main_25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 플레이 신청 횟수
        String game = st.nextToken(); // 게임 종류 (Y : 윷놀이, F : 그림 찾기, O : 원카드)

        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<N; i++) {
            String input = br.readLine();
            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1);
            } else {
                map.put(input, 1);
            }
        }

        if (game.equals("Y")) { // 윷놀이라면
            System.out.println(map.keySet().size());
        } else if (game.equals("F")) { // 그림 찾기라면
            System.out.println(map.keySet().size() / 2);
        } else if (game.equals("O")) { // 원카드라면
            System.out.println(map.keySet().size() / 3);
        }
    }
}
