class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass();
    int i, j;
    for (i = 1; i <= 8; i++) {
        for(j = 1; j <= 8; j++) {
            o.setNumber1(i);
            o.setNumber2(j);
            System.out.print(o.plus());
            System.out.print(" ");
        }
        System.out.println();
    }
	}
}

class MySecondClass {
  private int number1;
  private int number2;
  MySecondClass() {
    number1 = 0;
    number2 = 0;
  }
  int getNumber1() {
    return number1;
  }
  int getNumber2() {
    return number2;
  }
  void setNumber1(int source) {
    number1 = source;
  }
  void setNumber2(int source) {
    number2 = source;
  }
  int plus() {
    return number1 + number2; 
  }
  
}
