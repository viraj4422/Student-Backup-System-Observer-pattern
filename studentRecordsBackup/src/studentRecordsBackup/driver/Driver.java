/**
 * Author: Viraj Nimbalkar
 * Design Patterns Assignment 3
 */

package studentRecordsBackup.driver;

import studentRecordsBackup.fileRead.FileProcessor;
import studentRecordsBackup.fileRead.FileProcessorInterface;
import studentRecordsBackup.util.BSTBuilder;

public class Driver {

	public static void main(String[] args) {

		/**
		 * check if only two inputs are given
		 */
		if (args.length != 2) {
			System.err.println("Please provide two inputs...\n1.File Name \n 2.UPDATE_VALUE");
			System.exit(1);
		}
		/**
		 * check if input 2 is an integer
		 */

		int updateValue = 0;
		try {
			updateValue = Integer.parseInt(args[1]);
		} catch (NumberFormatException exception) {
			System.err.println("The UPDATE_VALUE should be an integer\n ");
		}
		FileProcessorInterface fileprocessor = new FileProcessor(args[0]);

		BSTBuilder builder = new BSTBuilder(fileprocessor);
		builder.build();

		System.out.println("main-BST---------->>\n");
		builder.one.printInorder(builder.one.root);
		builder.one.setMaxFlag(builder.one.root);
		// builder.one.maxValue(builder.one.root);
		builder.one.sumOfNodes(builder.one.root);

		System.out.println("\nbackup-1---------->>\n");
		builder.two.printInorder(builder.two.root);
		builder.two.sumOfNodes(builder.two.root);

		System.out.println("\nbackup-2---------->>\n");
		builder.three.printInorder(builder.three.root);
		builder.three.sumOfNodes(builder.three.root);

		System.out.println("\n"); // update
		builder.one.update(builder.one.root, updateValue);

		System.out.println("<------------------------Post Increment------------------->>\n");
		System.out.println("main-BST---------->>\n");
		builder.one.printInorder(builder.one.root);
		builder.one.sumOfNodes(builder.one.root);

		System.out.println("\nbackup-1---------->>\n");
		builder.two.printInorder(builder.two.root);
		builder.two.sumOfNodes(builder.two.root);

		System.out.println("\nbackup-2---------->>\n");
		builder.three.printInorder(builder.three.root);
		builder.three.sumOfNodes(builder.three.root);

		builder.one.sumOfNodes(builder.one.root, builder.two.root, builder.three.root);

	}
}
