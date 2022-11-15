// program for calculating a leap year, checks and prints out whether the year entered is one
import java.util.*


fun main() {
	
	var reader = Scanner(System.`in`)
	println("Enter Year : ")
	var year = reader.nextInt();

	var leap = if (year % 4 == 0){
		if (year % 100 == 0) {
			
			year % 400 == 0
		} else true
	} else false;

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}