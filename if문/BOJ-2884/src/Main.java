import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // ��
        int M = scanner.nextInt(); // ��
        M = M-45; // �п��� 45�� ������
        int temp;

        if(M>=0){ // 45�л��µ� 0���� ũ�� �״�� ����ϸ� �Ǵ°�
            System.out.println(H+" "+M);
        }
        else{ // 45�� ���µ� 0���� �۾ƹ�����
            if(H==0) // �ٵ� H�� 0�̸�(24�ø�) 23�ð� �Ǿ�� �ϹǷ�..
                H=23;
            else // �ƴϸ� �׳� H���� 1 ���� �Ǵ°�
                H = H-1;
            M=60+M; // 60���� ������ M�� ���ϸ� ���� M�� ����
            System.out.println(H+" "+M);
        }

    }
}