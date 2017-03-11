package studentRecordsBackup.util;

public class OddFilterImpl implements OddEvenFilterI {

	public boolean check(int value) {

		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}

}
