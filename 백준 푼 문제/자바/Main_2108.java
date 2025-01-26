package 자바;

import java.io.*;
import java.util.*;

public class Main_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int avg;
        int median;
        int mod;
        int range;

        // 산술평균
        long total = 0;
        for (int j : arr) {
            total += j;
        }
        if (total / arr.length >= 0) {
            avg = (int) Math.round((double) total / arr.length);
        } else {
            avg = (int) - Math.round(- (double) total / arr.length);
        }
        
        // 중앙값
        Arrays.sort(arr);
        median = arr[(int) Math.floor(arr.length / 2)];

        // 최빈값
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }
        int[] countArr = map.values().stream().mapToInt(Integer::intValue).toArray();
        countArr = Arrays.stream(countArr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int maxCount = countArr[0]; // 최빈값의 빈도
        List<Integer> list = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == maxCount) {
                list.add(i);
            }
        }
        Collections.sort(list);
        if (list.size() > 1) {
            mod = list.get(1);
        } else {
            mod = list.get(0);
        }

        // 범위
        int max = -4001;
        int min = 4001;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        range = max - min;

        bw.write(avg + "\n");
        bw.write(median + "\n");
        bw.write(mod + "\n");
        bw.write(range + "\n");
        
        bw.flush();
        bw.close();
    }
}
