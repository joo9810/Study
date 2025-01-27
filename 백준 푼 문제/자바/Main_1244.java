package 자바;

import java.io.*;
import java.util.*;

public class Main_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 스위치 수

        int[] switchArr = new int[N];
        switchArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // {0, 1, 0, 1, 0, 0, 0, 1}

        int M = Integer.parseInt(br.readLine()); // 학생 수
        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken()); // 성별
            int getNumber = Integer.parseInt(st.nextToken()); // 받은 수

            if (gender == 1) { // 남학생이라면
                for (int j=getNumber-1; j<N; j += getNumber) { // 받은 숫자의 배수만큼 탐색
                    if (switchArr[j] == 0) {
                        switchArr[j] = 1;
                    } else {
                        switchArr[j] = 0;
                    }
                }
            } else { // 여학생이라면
                // 받은 숫자 부분의 스위치는 무조건 바꾸기
                if (switchArr[getNumber-1] == 0) {
                    switchArr[getNumber-1] = 1;
                } else {
                    switchArr[getNumber-1] = 0;
                }

                int leftPosition = getNumber-1;
                int rightPosition = getNumber-1;
                while (true) {
                    leftPosition -= 1;
                    rightPosition += 1;
                    if (leftPosition <= -1 || rightPosition >= N) { // 스위치 배열의 범위를 벗어나면 스탑
                        break;
                    } else {
                        if (switchArr[leftPosition] == switchArr[rightPosition]) { // 좌우 스위치 상태가 같으면
                            if (switchArr[leftPosition] == 0) {
                                switchArr[leftPosition] = 1;
                                switchArr[rightPosition] = 1;
                            } else {
                                switchArr[leftPosition] = 0;
                                switchArr[rightPosition] = 0;
                            }
                        } else { // 좌우 스위치 상태가 다르면 스탑
                            break;
                        }
                    }
                }
            }
        }
        for (int k=0; k<N; k++) {
            if ((k+1) % 20 != 0) {
                System.out.print(switchArr[k] + " ");
            } else {
                System.out.println(switchArr[k]);
            }
            
        }
    }
}
