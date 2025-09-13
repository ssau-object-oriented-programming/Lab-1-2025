package myfirstpackage;

public class MyFirstPackage {
  private int number1;
  private int number2;
  public MyFirstPackage() {
    number1 = 0;
    number2 = 0;
  }
  public void setNumber1(int source) {
    number1 = source;
  }
  public void setNumber2(int source) {
    number2 = source;
  }
  public int plus() {
    return number1 + number2; 
  }
  
}

