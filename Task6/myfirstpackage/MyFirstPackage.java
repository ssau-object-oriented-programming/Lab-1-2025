// myfirstpackage/MyFirstPackage.java
package myfirstpackage;

public class MyFirstPackage {
	private int firstValue;
	private int secondValue;
	public MyFirstPackage(int firstValue, int secondValue){
		this.firstValue=firstValue;
		this.secondValue=secondValue;
	}
	
	public int getFirstValue(){return firstValue;}
	public int getSecondValue(){return secondValue;}
	public void setFirstValue(int firstValue){this.firstValue=firstValue;}
	public void setSecondValue(int secondValue){this.secondValue=secondValue;}
	public int valuesAddition(){return firstValue+secondValue;}
}