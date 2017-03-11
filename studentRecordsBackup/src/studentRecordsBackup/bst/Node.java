
package studentRecordsBackup.bst;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import studentRecordsBackup.util.OddEvenFilterI;

public class Node implements SubjectI, ObserverI {
	private int value;
	private Node left = null;
	private Node right = null;
	private boolean max = false;

	Map<ObserverI, OddEvenFilterI> observers = null;

	public Node(int valueIn) {
		observers = new HashMap<ObserverI, OddEvenFilterI>();
		this.value = valueIn;
	}
/**
 * method to update node value
 */
	@Override
	public void update(int updateValue) {

		setValue(getValue() + updateValue);
	}
	/**
	 * method to register Observers
	 */
	@Override
	public void registerObserver(ObserverI o, OddEvenFilterI filter) {

		observers.put(o, filter);
	}
/**
 * method to unregister from subject
 */
	@Override
	public void removeObserver(ObserverI o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	/**
	 * getter to get the value
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * setter to set the value
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * getter to get left node
	 * 
	 * @return
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * setter to set left node
	 * 
	 * @param left
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * getter to set right node
	 * 
	 * @return
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * setter to set right node
	 * 
	 * @param right
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * getter to get max flag
	 * 
	 * @return
	 */
	public Boolean getMax() {
		return max;
	}

	/**
	 * setter to set max flag
	 * 
	 * @param max
	 */
	public void setMax(Boolean max) {
		this.max = max;
	}

	/**
	 * method to notify all observer about change in the value
	 */
	@Override
	public void notifyAllObservers(int updateValue) {
		Iterator<Entry<ObserverI, OddEvenFilterI>> it = observers.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			ObserverI observer = (ObserverI) pair.getKey();
			OddEvenFilterI filter = (OddEvenFilterI) pair.getValue();
			if (filter.check(updateValue)) {
				observer.update(updateValue);
			}
		}

	}

}
