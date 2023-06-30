
public class Lecture5 {
	public static void main(String[] args) {
		int x=5;
		int y=7;
		float f=(float) 5.5; //by default considers decimal to be double
		float f2= 5.5f;
		double d = 10.5;
		char ch = 'a';
		System.out.println(ch);
		//Task - 1: Different ways to convert character to int.
		int z = x + y;
		//+-> operator
		// x,y -> operands I
		int m=5;
		int n=m++;
		System.out.println("M is :"+m+" , N is :"+n);
		int p=5;
		int q=++p;
		System.out.println("P is :"+p+" , Q is :"+q);
	}
}
