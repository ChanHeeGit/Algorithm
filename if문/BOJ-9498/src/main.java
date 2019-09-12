import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Score = scanner.nextInt();

        if(90<=Score && Score<=100)
            System.out.println("A");
        else if(80<=Score && Score<=89)
            System.out.println("B");
        else if(70<=Score && Score<=79)
            System.out.println("C");
        else if(60<=Score && Score<=69)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
