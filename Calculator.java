package week2.day3;

public class Calculator {
	public void multiplyTwoNumber(int a ,int b, int c) {
		int f=a*b;
		System.out.println(f);
	}
	public void subtractTwoNumber(int a , int b) {		
		int e=a-b;
		System.out.println(e);
	}
	public void divideTwoNumber(double a , int b) {	
		double d=a/b;
		System.out.println(d);
	}
	public void addTwoNumbers(int a , int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {	
		Calculator ans=new Calculator();
		ans.addTwoNumbers(10,10);
		ans.divideTwoNumber(5.13246,3);
		ans.subtractTwoNumber(200,100);
		ans.multiplyTwoNumber(15,12,10);
	}

}
