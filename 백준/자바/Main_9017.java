package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_9017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 2
        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine()); // 15
            int[] arr = new int[N];
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            // 팀이 6명인지 판별
            Map<Integer, Integer> teamCountMap = new HashMap<>();
            for (int j=0; j<N; j++) {
                if (teamCountMap.containsKey(arr[j])) {
                    teamCountMap.put(arr[j], teamCountMap.get(arr[j]) + 1); // 해당 팀 번호가 키에 있으면 +1
                } else {
                    teamCountMap.put(arr[j], 1); // 없으면 1로 넣기
                }
            }

            // 6명인 팀 개별 점수 채우기
            int[] scoreArr = new int[N];
            int score = 1;
            for (int j=0; j<N; j++) {
                if (teamCountMap.get(arr[j]) == 6) {
                    scoreArr[j] = score++;
                } else {
                    scoreArr[j] = -1;
                }
            }

            // 6명인 팀의 점수를 담은 맵
            Map<Integer, List<Integer>> fourScoreMap = new HashMap<>();
            for (int j=0; j<N; j++) {
                if (teamCountMap.get(arr[j]) == 6) {
                    if (fourScoreMap.containsKey(arr[j])) {
                        fourScoreMap.get(arr[j]).add(scoreArr[j]);
                    } else {
                        List<Integer> inputList = new ArrayList<>();
                        inputList.add(scoreArr[j]);
                        fourScoreMap.put(arr[j], inputList);
                    }
                }
            }

            // 4명의 점수 합을 담을 맵
            Map<Integer, Integer> sumScoreMap = new HashMap<>();
            for (int j : fourScoreMap.keySet()) {
                for (int k=0; k<4; k++) {
                    if (k == 0) {
                        sumScoreMap.put(j, fourScoreMap.get(j).get(k));
                    } else {
                        sumScoreMap.put(j, sumScoreMap.get(j) + fourScoreMap.get(j).get(k));
                    }
                }
            }

            // 4명의 점수 합을 리스트에 담기
            List<Integer> sumScoreList = new ArrayList<>();
            for (int j : sumScoreMap.values()) {
                sumScoreList.add(j);
            }

            // 점수의 최솟값 찾기
            Collections.sort(sumScoreList); // 오름차순
            int minScore = sumScoreList.get(0);

            // 점수의 최솟값에 해당하는 팀 번호 찾기
            List<Integer> minScoreTeamNumber = new ArrayList<>();
            for (int j : sumScoreMap.keySet()) {
                if (sumScoreMap.get(j) == minScore) {
                    minScoreTeamNumber.add(j);
                }
            }

            // 점수의 최솟값에 해당하는 팀이 1팀이면
            if (minScoreTeamNumber.size() == 1) {
                bw.write(minScoreTeamNumber.get(0) + "\n");
            } else { // 팀이 2팀 이상이면
                List<Integer> fiveMemberScoreList = new ArrayList<>();
                for (int j : minScoreTeamNumber) { // 최솟값에 해당하는 팀의 5번째 주자 확인
                    fiveMemberScoreList.add(fourScoreMap.get(j).get(4));
                }
                Collections.sort(fiveMemberScoreList);
                int fiveMemberMinScore = fiveMemberScoreList.get(0);
                for (int j : minScoreTeamNumber) {
                    if (fourScoreMap.get(j).get(4) == fiveMemberMinScore) {
                        bw.write(j + "\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
