import java.io.IOException;
import java.util.Scanner;

public class InputEx {
  public static void main(String[] args) throws IOException{
    // int i = 10;

    // System.out.println("i = " + i);

    // System.out.println("문자열 입력 : ");
    
    // i = System.in.read();
    // System.out.println("i = " + i);
    // System.out.println(System.in.read());
    // System.out.println(System.in.read());
    // System.out.println(System.in.read());
    // System.out.println(System.in.read());

    // Scanner sc = new Scanner(System.in);

    // System.out.println("문자열 입력 : ");
    // // String message = sc.next();
    // String message = sc.nextLine();
    // System.out.println(message);

    int kor = 90, math = 80;
    int sum = 0;

    kor = 10;
    kor = kor + kor;
    System.out.println("총점 : " + kor);
    
    kor = 10;
    kor += kor;
    System.out.println("총점 : " + kor);
  }

}
