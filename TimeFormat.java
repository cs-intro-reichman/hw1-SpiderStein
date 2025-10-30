// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		String AMPMTime = "";
		if (hours > 12) {
			AMPMTime += (hours - 12);
		} else {
			AMPMTime += hours;
		}
		AMPMTime += ":";
		if (minutes < 10) {
			AMPMTime += "0";
		}
		AMPMTime += minutes;
		AMPMTime += (hours >= 12) ? " PM" : " AM";
		System.out.println(AMPMTime);
	}
}