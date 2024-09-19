public class OuterEx {
  class InstanceClass{
    int iciv = 100;
    final static int ICONST = 100;
  }
  InstanceClass ic = new InstanceClass();
  
  static class StaticClass{
    int sciv = 200;
    static int scsv = 200;
  }
  StaticClass sc = new StaticClass();
  
  void method(){
    int m;
    class LocalClass{
      int lciv = 300;
      final static int LCONST = 300;
    }
    LocalClass lc = new LocalClass();
    InstanceClass lcic = new InstanceClass();
    StaticClass lcsc = new StaticClass();
  }
  
}
