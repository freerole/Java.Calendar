package calendar;

import java.util.Scanner;

public class addTwoSum {
	public static void main(String[] args) {
		int a, b;
		String s1, s2;
		System.out.println("두 수의 합을 구하시오.");
		Scanner scanner = new Scanner(System.in);
		
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("두수의 합은 %d", a + b);
		
		scanner.close();
	}
}
