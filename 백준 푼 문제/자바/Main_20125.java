package 자바;

import java.io.*;

public class Main_20125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int heartRow = 0;
        int heartCol = 0;
        int leftArmLength = 0;
        int rightArmLength = 0;
        int waistLength = 0;
        int leftLegLength = 0;
        int rightLegLength = 0;

        // 쿠키 배열 만들기
        String[][] cookieArr = new String[N][N];
        for (int i=0; i<N; i++) {
            String[] input = br.readLine().split("");
            for (int j=0; j<N; j++) {
                cookieArr[i][j] = input[j];
            }
        }

        // 머리 위치로 심장 위치 찾기
        boolean findHeart = false;
        for (int i=0; i<N; i++) { // 행 위치
            for (int j=0; j<N; j++) { // 열 위치
                if (cookieArr[i][j].equals("*")) {
                    heartRow = i+1;
                    heartCol = j;
                    findHeart = true;
                    break;
                }
            }
            if (findHeart == true) {
                break;
            }
        }

        // 왼팔 길이 구하기
        for (int i=0; i<N; i++) {
            if (cookieArr[heartRow][i].equals("*")) {
                leftArmLength = heartCol - i;
                break;
            }
        }

        // 오른팔 길이 구하기
        for (int i=heartCol+1; i<N; i++) {
            if (cookieArr[heartRow][i].equals("*")) {
                rightArmLength += 1;
            }
        }

        // 허리 길이 구하기
        for (int i=heartRow+1; i<N; i++) {
            if (cookieArr[i][heartCol].equals("*") == false) {
                waistLength = (i-1) - heartRow;
                break;
            }
        }

        // 다리 길이 구하기
        for (int i=heartRow+waistLength+1; i<N; i++) {
            if (cookieArr[i][heartCol-1].equals("*") && cookieArr[i][heartCol+1].equals("*")) {
                leftLegLength += 1;
                rightLegLength += 1;
            } else if (cookieArr[i][heartCol-1].equals("*")) {
                leftLegLength += 1;
            } else if (cookieArr[i][heartCol+1].equals("*")) {
                rightLegLength += 1;
            }
        }
        bw.write((heartRow+1) + " " + (heartCol+1) + "\n");
        bw.write(leftArmLength + " " + rightArmLength + " " + waistLength + " " + leftLegLength + " " + rightLegLength);
        bw.flush();
        bw.close();
    }
}
