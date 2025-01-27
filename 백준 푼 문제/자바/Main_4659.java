package 자바;

import java.io.*;

public class Main_4659 {
    public static boolean motherSound(char input) {
        char[] motherSound = {'a', 'e', 'i', 'o', 'u'};
        for (char c : motherSound) {
            if (input == c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            // 종료 조건
            if (input.equals("end")) {
                break;
            }

            boolean case1 = false; // 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
            boolean case2 = true; // 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
            boolean case3 = true; // 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

            // case1 판별
            for (int i=0; i<input.length(); i++) {
                if (motherSound(input.charAt(i)) == true) {
                    case1 = true;
                    break;
                }
            }

            // case2 판별
            int seqMotherCount = 0;
            int seqSonCount = 0;
            for (int i=0; i<input.length(); i++) {
                if (motherSound(input.charAt(i)) == true) {
                    seqSonCount = 0;
                    seqMotherCount += 1;
                    if (seqMotherCount == 3) {
                        case2 = false;
                        break;
                    }
                } else {
                    seqMotherCount = 0;
                    seqSonCount += 1;
                    if (seqSonCount == 3) {
                        case2 = false;
                        break;
                    }
                }
            }

            // case3 판별
            for (int i=0; i<input.length()-1; i++) {
                if (input.charAt(i) == input.charAt(i+1)) {
                    if (input.charAt(i) != 'e' && input.charAt(i) != 'o') {
                        case2 = false;
                        break;
                    }
                }
            }

            // 출력
            if (case1 == true && case2 == true && case3 == true) {
                bw.write("<" + input + "> " + "is acceptable.\n");
            } else {
                bw.write("<" + input + "> " + "is not acceptable.\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
