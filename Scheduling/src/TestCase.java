package  src;

public class TestCase {
	public static void main(String args[]) {
		Restaurant r = Restaurant.getInstance();
		
		PartTimeStaff staff = new PartTimeStaff("Tony");
		staff.addTimeSlot(new Shift("2017-10-18","0800","0900"));
		staff.addTimeSlot(new Shift("2017-12-18","1200","1500"));
		staff.reportAll();
	}

}
