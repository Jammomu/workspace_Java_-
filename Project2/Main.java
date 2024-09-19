public class Main {
  public static void main(String[] args){
    // Parent p = new Parent();
    // Child c1 = new Child();
    // SChild c2 = new SChild();
    // GChild gc = new GChild();

    // System.out.println(p.age);
    // System.out.println(c1.age);
    // System.out.println(c2.age);
    // System.out.println(gc.age);
    // p.method();
    // c1.method();
    // c2.method();
    // gc.method();

    // OuterEx oc = new OuterEx();
    // System.out.println("oc.ic.iciv = " + oc.ic.iciv);

    // OuterEx.InstanceClass oic = oc.new InstanceClass();
    // System.out.println("oic.iciv = " + oic.iciv);
    // System.out.println(OuterEx.InstanceClass.ICONST);
    // System.out.println("==============================");
   
    // OuterEx.StaticClass osc = new OuterEx.StaticClass();
    // System.out.println("osc.sciv = " + osc.sciv);
    // System.out.println(OuterEx.StaticClass.scsv);

    // Parent p = new Parent(){
    //   public void method(){
    //     System.out.println("Child 나이 : " + this.age);
    //   }  
    // };
    // p.method();
    // Child c = new Child();
    // c.method();

    // FireCar fc = new FireCar();
    // Amblulance ac = new Amblulance();

    // ac = (Amblulance)fc;
    // Car car = null;
    // car = fc;
    // car = ac;
    // car.water();
 
    // FireCar fc2 = null;
    // fc2 = (FireCar)car;

    // Car cc = new Car();
    // cc.drive(fc);
    // cc.drive(ac);

    // Tv t = new Tv();
    // Audio a = new Audio();
    // Computer c = new Computer();

    // int v = 10;
    // Integer iv = v;
    // v = iv;
    // Buyer b = new Buyer();

    // b.buy(t);
    // b.buy(a);
    // b.buy(c);
    // System.out.println("남은 금액 : " + b.getMoney()+ "만원");
    // System.out.println("누적포인트 : " + b.getBonusPoint()+ "점");

    // ExceptionEx ex = new ExceptionEx();
    // ex.method2();

    ArrayEx aex = new ArrayEx();
    aex.method();
  }
}

// Buyer
// money, bonusPoint : 물건값의 10%

// Tv, Audio, Computer
// price, bonusPoint 
