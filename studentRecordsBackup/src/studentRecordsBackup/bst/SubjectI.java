package studentRecordsBackup.bst;

import studentRecordsBackup.util.OddEvenFilterI;

public interface SubjectI {

	public void registerObserver(ObserverI o, OddEvenFilterI filter);

	public void removeObserver(ObserverI o);

	public void notifyAllObservers(int updateValue);
}
