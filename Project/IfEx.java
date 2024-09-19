import java.util.Scanner;

public class IfEx {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int count;

    System.out.println("방문 횟수 : ");
    count = sc.nextInt();

    if(count < 1){
      System.out.println("처음 방문하셨군요. 5층 안내 센터에서 커피 쿠폰을 받아가세요.");
    }
    System.out.printf("행복한 쇼핑 시간 보내세요. \n방문횟수 : %d번\n", ++count);

  }

}
