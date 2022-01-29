package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();

		System.out.println(tarihSaat);// 2021-12-02T23:39:44.293208

		tarihSaat.toString(); // stringe cevırır, cevırırsek strıng manipulatıon yapabılıriz

		System.out.println(tarihSaat.toString().startsWith("2021")); // true

	}

}
