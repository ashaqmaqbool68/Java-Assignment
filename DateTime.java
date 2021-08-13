import java.time.LocalDateTime;

public class DateTime {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.of(2017, 11, 6, 6, 30, 40, 50000);

		System.out.println("Hour = " + ldt.getHour());
		System.out.println("Minute = " + ldt.getMinute());
		System.out.println("Second = " + ldt.getSecond());
		System.out.println("Nano = " + ldt.getNano());

		System.out.println("Year = " + ldt.getYear());
		System.out.println("Month = " + ldt.getMonth());
		System.out.println("Date = " + ldt.getDayOfMonth());

	}
}