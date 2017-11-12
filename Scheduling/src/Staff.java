package src;

import java.util.ArrayList;

public abstract class Staff {
	protected ArrayList<Shift> shift = new ArrayList();
	protected String name;
	
	protected void reportAll() {
		String message = name + ": \n";
		for(Shift t: shift) {
			message += t.report() + "\n";
		}
		System.out.println(message);
	}
	
	protected void addTimeSlot(Shift s) {
		shift.add(s);
	}
	
	
	// toString
	public String toString()
	{
		return name + "Hello";
	}
}
