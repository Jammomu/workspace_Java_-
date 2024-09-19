public class Products {
  int price;
  int bonusPoint;

  Products(int price){
    this.price = price;
    this.bonusPoint = (int)(price/10.0);
  }
}

class Tv extends Products{
  Tv(){
    super(100);
  }
  public String toString(){
    return "Tv";
  }
}

class Audio extends Products{
  Audio(){
    super(200);
  }
  public String toString(){
    return "Audio";
  }
}

class Computer extends Products{
  Computer(){
    super(300);
  }
  public String toString(){
    return "Computer";
  }
}

class Buyer{
  int money = 1000;
  int bonusPoint = 0;

  Buyer(){}
  Buyer(int money, int bonusPoint){
    this.money = money;
    this.bonusPoint = bonusPoint;
  }

  public void setMoney(int mn){
    this.money = mn;
  }
  public int getMoney(){
    return this.money;
  }
  public void setBonusPoint(int bp){
    this.bonusPoint = bp;
  }
  public int getBonusPoint(){
    return this.bonusPoint;
  }

  public void buy(Products p){
    System.out.println("[" +p+ "]를 구매 하셨습니다.");
    this.money = this.money - p.price;
    this.bonusPoint = this.bonusPoint + p.bonusPoint;
  }
}