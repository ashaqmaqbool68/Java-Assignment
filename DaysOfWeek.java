package basics;

import java.util.Scanner;

public class DaysOfWeek {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Enter days of week");
		i=input.nextInt();
		switch(i)
		{
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		}	
	}

}
