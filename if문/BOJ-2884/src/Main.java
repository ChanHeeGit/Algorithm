import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // 시
        int M = scanner.nextInt(); // 분
        M = M-45; // 분에서 45를 빼버림
        int temp;

        if(M>=0){ // 45분뺐는데 0보다 크면 그대로 출력하면 되는것
            System.out.println(H+" "+M);
        }
        else{ // 45분 뺐는데 0보다 작아버리면
            if(H==0) // 근데 H가 0이면(24시면) 23시가 되어야 하므로..
                H=23;
            else // 아니면 그냥 H에서 1 빼면 되는거
                H = H-1;
            M=60+M; // 60에다 음수인 M을 더하면 현재 M이 나옴
            System.out.println(H+" "+M);
        }

    }
}