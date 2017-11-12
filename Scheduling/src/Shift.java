package src;

<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/tony1233465/gp26
public class Shift {
	private String date;
	private String startTime;
	private String endTime;

	public Shift(String d, String start, String end) {
		date = d;
		startTime = start;
		endTime = end;
	}

	public String report() {
		return date.toString() + ": " + startTime + "-" + endTime;
	}
}
