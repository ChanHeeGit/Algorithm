import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine()); //int로 형변환

        for(int i=0; i<test; i++){
            st = new StringTokenizer(br.readLine()); // 공백단위로 구분
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b +"\n"); // 합 출력
           }
           bw.flush(); // 버퍼 비우기
           bw.close();
    }
}
