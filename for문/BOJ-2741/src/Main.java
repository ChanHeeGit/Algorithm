import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int p = 0;
       for(int i=0; i<n; i++){
           p=i+1;
           System.out.println(p);
       }
    }
}
