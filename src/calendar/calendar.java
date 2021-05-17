package calendar;

import java.util.Scanner;

public class calendar {
	private static final int[] Max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	
	public int maxDayOfMonth(int month){
		return Max_Days[month - 1];
	}
	
	public void calendarSample() {
		System.out.println(" 일  월   화  수  목   금   토");
		System.out.println("--------------------------");
		System.out.println(" 1   2   3   4   5   6   7");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28");
		System.out.println("29  30  31                ");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello.Calendar");	
		
		System.out.println("알고싶으신 달 입력 하세요........");		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		calendar cal = new calendar();
		int day = cal.maxDayOfMonth(month);
		
		System.out.printf("%d 달의 마지막 날은 %d 입니다.", month, day);
		
	}	
}
