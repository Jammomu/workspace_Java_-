public class Parent {
  int age = 45;

  public void method(){
    System.out.println("Parent 나이 : " + age);
  }
}

// class Child extends Parent{

//   public void method(){
//     int age = 30;
//     System.out.println("Child 나이 : " + this.age);
//     System.out.println("Parent 나이 : " + super.age);
//   }
  
// }

// class SChild extends Parent{
//   public void method(){
//     System.out.println("Schild");
//   }
  
// }

// class GChild extends Child{
//   public void method(){
//     System.out.println("GChild");
//   }

// }