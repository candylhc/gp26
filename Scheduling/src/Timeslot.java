package src;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/tony1233465/gp26
public class Timeslot {
	
	private String date;
	private String startTime;
	private String endTime;
	private int shiftsNeeded;
	
	public Timeslot() {
		
	}
	
	public Timeslot(String start, String end, int shift) {
		startTime = start;
		endTime = end;
		shiftsNeeded = shift;
	}
}
