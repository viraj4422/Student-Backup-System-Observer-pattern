package studentRecordsBackup.util;

public class EvenFilterImpl implements OddEvenFilterI {
	/**
	 * method to check if input is even or odd
	 */
	public boolean check(int value) {

		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
