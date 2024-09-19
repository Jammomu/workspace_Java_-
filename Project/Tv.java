public class Tv {
  String color;
  int channel;
  boolean power;

  void setColor(String clr){
    color = clr;
  }
  void setPower(){
    power = !power;
    if(power){
      System.out.println("TV가 켜졌습니다.");
    }else{
      System.out.println("TV가 꺼졌습니다.");
    }
    System.out.println();
  }

  void setChannel(int ch){
    if(power){
      if( (ch<0) || (ch>120)){
        ch = channel;
      }
      channel = ch;
      System.out.printf("현재 채널 : %d", channel);
    }
  }
  
  void channelUp(){
    if(power){
      channel++;
      if(channel>120){
        channel = 0;
      }
      System.out.printf("현재 채널 : %d", channel);
    }
  }

  void channelDown(){
    if(power){
      channel--;
      if(channel<0){
        channel = 120;
      }
      System.out.printf("현재 채널 : %d", channel);
    }
  }

  void disp(){
    String state = "Off";
    if(power){
      state = "On";
    }
    System.out.println("\n[Tv 상태정보]");
    System.out.printf("색상 : %s\n", color);
    System.out.printf("전원 : %s\n", state);
    System.out.printf("채널 : %d\n", channel);
  }
}
