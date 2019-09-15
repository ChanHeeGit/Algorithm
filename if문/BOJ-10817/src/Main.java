import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int num[] = new int[3];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(num);
        System.out.println(num[1]);
    }
    }