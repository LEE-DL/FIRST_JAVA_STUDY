package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		int a = -5;
		int b = +a;
		int c = -a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = ++c; // c = c+1;
		System.out.println(d);
		System.out.println(c);
		
		int e = c++; // c = c+1;
		System.out.println(e);
		System.out.println(c);
		
		
		int x = 5;
		int y = 2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x / (double)y);
		System.out.println(x % y);
	}

}
