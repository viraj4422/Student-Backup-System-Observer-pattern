package studentRecordsBackup.util;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.bst.ObserverI;
import studentRecordsBackup.bst.SubjectI;
import studentRecordsBackup.fileRead.FileProcessorInterface;

public class BSTBuilder {
	private FileProcessorInterface fileProcessor = null;

	public BST one = new BST();
	public BST two = new BST();
	public BST three = new BST();
	String line = null;

	/**
	 * this is a parameterised constructor
	 * 
	 * @param fileProcessorIn
	 */
	/**
	 * @param fileProcessorIn
	 */
	public BSTBuilder(FileProcessorInterface fileProcessorIn) {

		fileProcessor = fileProcessorIn;

	}

	/**
	 * method to intialise file and read from file
	 */
	public void build() {
		fileProcessor.initliazeFile();

		while ((line = fileProcessor.readLineFromFile()) != null) {

			int a = Integer.parseInt(line);

			SubjectI subjectNode = one.insert(a);
			ObserverI observerOne = two.insert(a);
			ObserverI observerTwo = three.insert(a);

			subjectNode.registerObserver(observerOne, new EvenFilterImpl());
			subjectNode.registerObserver(observerTwo, new OddFilterImpl());

		}
	}
}
