package practical;

import java.util.Comparator;

public class Compares implements Comparator<Integer>{

	@Override
	public int compare(Integer t1, Integer t2) {
		if (t1 > t2) {
			return -1;
		} else if (t1 == t2) {
			return 0;
		} else {
			return 1;
		}
	}
	
	
}
