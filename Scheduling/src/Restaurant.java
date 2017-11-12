package src;


import java.util.ArrayList;

public class Restaurant {
	private static Restaurant instance = new Restaurant();

	private Restaurant() {
	}

    public static Restaurant getInstance(){
        return instance;
    }
}
