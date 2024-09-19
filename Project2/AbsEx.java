public interface AbsEx {
  int width = 10;
  public static final int height = 10;

  abstract void setArea(int width, int height);
  abstract int getArea();
}

class CAbsEx implements AbsEx{
  int area;

  public CAbsEx(){
    this.area = width * height;
  }
  public void setArea(int width, int height){
    this.area = width * height;
  }

  public int getArea(){
    return this.area;
  }
}