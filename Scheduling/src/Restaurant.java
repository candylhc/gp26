<<<<<<< HEAD
package src;


=======

package src;
>>>>>>> branch 'master' of https://github.com/tony1233465/gp26
import java.util.ArrayList;

public class Restaurant {
	private static Restaurant instance = new Restaurant();

	private Restaurant() {
	}

    public static Restaurant getInstance(){
        return instance;
    }
}
