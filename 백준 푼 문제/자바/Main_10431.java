package 자바;

import java.io.*;
import java.util.*;

public class Main_10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());

        for (int i=0; i<P; i++) {
            int move = 0;
            List<Integer> list = new ArrayList<>();
            int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] studentArr = Arrays.copyOfRange(inputArr, 1, inputArr.length);
            for (int j=0; j<20; j++) {
                if (j == 0) { // 첫 번째 학생은 그냥 넣기
                    list.add(studentArr[j]);
                } else {
                    for (int k=0; k<list.size(); k++) {
                        if (list.get(k) > studentArr[j]) {
                            move += (list.size() - k);
                            list.add(k, studentArr[j]);
                            break;
                        } else if (k == list.size()-1 && list.get(k) <= studentArr[j]) {
                            list.add(studentArr[j]);
                            break;
                        }
                    }
                }
            }
            bw.write(inputArr[0] + " " + move + "\n");
        }
        bw.flush();
        bw.close();
    }
}
