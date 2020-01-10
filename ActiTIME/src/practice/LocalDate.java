package practice;

import java.time.LocalDateTime;
import java.util.Date;

public class LocalDate
{
	public static void main(String[] args) {
		  Date d = new Date();
		  System.out.println("system date"+d.getDate());
		  LocalDateTime ld = LocalDateTime.now();
		  System.out.println("system date After one month"+ld.plusDays(60));
		  System.out.println("month"+ld.plusMonths(1));
	}

	



}
