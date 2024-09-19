import java.util.Scanner;

public class LoopEx {
  public static void main(String[] args){
  // int sum = 0;
  // int num = 0;

    // while(true){
    //   ++num;
    //   if(num%2 != 0){
    //     continue;
    //   }
    //   sum += num;
    //   System.out.println("num : " + num);

    //   if(num >=10){
    //     break;
    //   }
    // }
    // System.out.println("1에서 10까지 짝수의 합 : " + sum);

    // int [] arr = new int[5];

    // for(int i=0; i<5; i++){
    //   arr[i] = 10+i;
    // }

    // for(int i=0; i<5; i++){
    //   System.out.println("arr["+i+"] = " + arr[i]);
    // }

    // String name;
    // int age;

    // name = "김강사";
    // age = 25;

    // System.out.println("이름 : " + name);
    // System.out.println("나이 : " + age + "살");
    
    // Info in = new Info();

    // in.name = "김강사";
    // in.age = 25;

    // System.out.println("이름 : " + in.name);
    // System.out.println("나이 : " + in.age + "살");

    Scanner sc = new Scanner(System.in);

    Tv t = new Tv();

    boolean flag = true;
    while(flag){
      System.out.println("1. On/Off");
      System.out.println("2. 채널 지정");
      System.out.println("3. 채널 변경");
      System.out.println("4. 색상 변경");
      System.out.println("5. TV 정보");
      System.out.print("메뉴 선택 : ");

      int menu = sc.nextInt();
      sc.nextLine();

      switch(menu){
        case 1:
          t.setPower();
          break;
        case 2:
          System.out.print("채널 입력 : ");
          int ch = sc.nextInt();
          sc.nextLine();

          t.setChannel(ch);
          break;
        case 3:
          boolean f = true;
          while(f){
            System.out.print("UP(+)/Down(-) : ");
            String dir = sc.nextLine();

            if(dir.equals("+")){
              t.channelUp();
            }else if(dir.equals("-")){
              t.channelDown();
            }else{
              f=false;
            }
            System.out.println();
          }
          break;
        case 4:
          System.out.print("색상 입력 : ");
          String col = sc.nextLine();

          t.setColor(col);
          break;
        case 5:
          t.disp();
          break;
        default:
          System.out.println("프로그램 종료");
          flag = false;
      }
      System.out.println();
    }
  }
}
