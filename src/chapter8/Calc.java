package chapter8;

public interface Calc {
	
	double PI = 3.14;
	int ERROR= -9999999;
	
	int add(int num1, int num2);
	int subStract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		mystaticMethod();
		return total;
		
	}
	private void myMethod() {       //디폴트 메서드로 들어가는 일반 private메서드
		System.out.println("private method");
	}
	private static void mystaticMethod() {
		System.out.println("private static method");
	}

}
