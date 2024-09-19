public class Car {
  String color;
  int door;

  void drive(Car c){
    if(c instanceof FireCar){
      FireCar f = (FireCar)c;
      f.water();
    }
    if(c instanceof Amblulance){
      Amblulance a = (Amblulance)c;
      a.hospital();
    }
    System.out.println("출발");
  }
  void park(){
    System.out.println("정지");
  }
}

class FireCar extends Car{
  void water(){
    System.out.println("[소방차]");
  }
}

class Amblulance extends Car{
  void hospital(){
    System.out.println("[앰뷸런스]");
  }
}