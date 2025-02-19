package 자바;

import java.io.*;
import java.util.*;

public class Main_30804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];
        inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;
        while (right < N) {
            if (map.keySet().size() <= 2) { // 탕후루 종류가 2종류 이하면
                // 오른쪽 위치 확인
                int rightKey = inputArr[right];
                if (map.containsKey(rightKey)) { // 키가 있으면
                    map.put(rightKey, map.get(rightKey)+1);
                } else { // 키가 없으면
                    map.put(rightKey, 1);
                }
                // 길이 측정
                if (map.keySet().size() <= 2) { // 오른쪽 확인 후에도 종류가 2종류 이하면
                    // 길이 측정 후 오른쪽 위치 이동
                    int length = right - left + 1;
                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
                right += 1;
            } else { // 탕후루 종류가 2종류 이상이면
                // 왼쪽 위치 확인
                int leftKey = inputArr[left];
                map.put(leftKey, map.get(leftKey)-1);
                if (map.get(leftKey) == 0) { // 왼쪽 위치를 뺐을때 탕후루 개수가 0개면
                    map.remove(leftKey); // 그 과일을 키에서 삭제
                }
                left += 1; // 왼쪽 위치를 증가
            }
        }
        System.out.println(maxLength);
    }
}