package 자바;

import java.io.*;
import java.util.*;

public class Main_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] inputList = new int[N];
        inputList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> intSet = new HashSet<>();
        for (int i : inputList) {
            intSet.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> intSetList = new ArrayList<>(intSet);
        Collections.sort(intSetList);

        // intSetList : 정렬한 유니크 숫자 리스트
        for (int i=0; i<intSetList.size(); i++) {
            map.put(intSetList.get(i), i);
        }

        // System.out.println(map);

        for (int i : inputList) {
            bw.write(map.get(i) + " ");
        }
        bw.flush();
        bw.close();
    }
}
