public class ExceptionEx {
  void method(){
    System.out.println(1);
    try{
      System.out.println(2);
      System.out.println(2/0);
      System.out.println(3);
    }catch(Exception e){
      System.out.println(4);
    }finally{
      System.out.println(5);
    }
    System.out.println(6);
  }
  void method1(){
    try{
      // Exception e = new Exception();
      throw new Exception("사용자 예외 발생");
    }catch(Exception e){
      e.printStackTrace();
      System.out.println("예외 메시지 : " + e.getMessage());
    }finally{
      System.out.println("Out of 예외 " );
    }
    System.out.println("Out of 예외 " );
  }

  void method2(){
    try{
      method3();
    }catch(Exception e){
      System.out.println(e.getMessage());
      System.out.println("method2() : 사용자 예외 처리");
    }
  }
  void method3() throws Exception{
    method4();
  }
  void method4() throws Exception{
    try{
      Exception e = new Exception("method4() : 사용자 예외 발생");
      throw e;
    }catch(Exception e){
      System.out.println("method4() : " + e.getMessage());
      System.out.println("method4() : 사용자 예외 처리");
      throw e;
    }
  }
}
