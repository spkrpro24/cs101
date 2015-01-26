
public class Time {
	public static void main(String[] args) {
		int hour, minute, second, secondsThatHavePassed, totalsecondsInADay;
		hour = 20;
		minute = 30;
		second = 22;
		totalsecondsInADay = 86400;	//The total seconds in a day
		secondsThatHavePassed = +(second + (minute*60) + (hour*3600));	//current seconds that have passed
		System.out.println("The number of seconds since midnight:" +(second + (minute*60) + (hour*3600)));
		System.out.println("The number of seconds to midnight:" +((60-second) + ((60-1-minute)*60) + (24-1-hour)*3600));
		System.out.println("Percentage of the Day that has passed:" +(secondsThatHavePassed*100/totalsecondsInADay));
	}
}

