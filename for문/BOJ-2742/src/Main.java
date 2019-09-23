import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int p=0;
       for(int i=n+1; i>1; i--){
           p=i-1;
           System.out.println(p);
       }
    }
}

