package studentRecordsBackup.bst;

public class BST {

	public Node root = null;

	static int sumOfNodes = 0;

	static int temp = 0;

	/**
	 * method to add new node in a tree
	 * 
	 * @param a
	 * @return
	 */
	public Node insert(int a) {
		Node node = new Node(a);

		if (root == null) {
			root = node;

		} else {
			Node focusNode = root;
			Node parent;
			while (true) {

				parent = focusNode;
				if (node.getValue() < focusNode.getValue()) {
					focusNode = focusNode.getLeft();

					if (focusNode == null) {
						parent.setLeft(node);
						return node;
					}
					parent = focusNode;
				}

				if (node.getValue() > focusNode.getValue()) {
					if (focusNode.getMax() == true) {
					}
					focusNode = focusNode.getRight();
					if (focusNode == null) {
						parent.setRight(node);
						return node;
					}
					parent = focusNode;
				}
			}
		}
		return node;
	}

	/**
	 * method to set flag of maximum value node in a tree
	 * 
	 * @param focusNode
	 */
	public void setMaxFlag(Node focusNode) {
		if (focusNode != null) {
			if (focusNode.getLeft() == null && focusNode.getRight() == null) {
				focusNode.setMax(true);

			} else if (focusNode.getRight() != null)
				setMaxFlag(focusNode.getRight());

			else if (focusNode.getRight() == null && focusNode.getLeft() != null)
				focusNode.setMax(true);
		}

	}

	/**
	 * method to print tree inOrder
	 * 
	 * @param focusNode
	 */
	public void printInorder(Node focusNode) {
		if (focusNode != null) {

			if (focusNode.getLeft() != null)
				printInorder(focusNode.getLeft());
			System.out.print(focusNode.getValue() + "\t");
			if (focusNode.getRight() != null)
				printInorder(focusNode.getRight());
		}
	}

	/**
	 * method to calculate sum of all nodes
	 * 
	 * @param focusNode
	 * @return
	 */
	public int sumOfNodes(Node focusNode) {
		sumOfNodes = 0;
		int sumIs = sumHelper(focusNode);

		System.out.println("\n\nThe sum of all the B-Numbers is: " + sumIs);

		return sumIs;
	}

	/**
	 * method to print sum of all the nodes in all three trees(additional)
	 * 
	 * @param focusNode1
	 * @param focusNode2
	 * @param focusNode3
	 * @return
	 */
	public int sumOfNodes(Node focusNode1, Node focusNode2, Node focusNode3) {
		sumOfNodes = 0;
		int sum1 = sumHelper(focusNode1) + sumHelper(focusNode2) + sumHelper(focusNode3);

		System.out.println("\nThe sum of all the B-Numbers in all three trees is: " + sumOfNodes);

		return sum1;
	}

	/**
	 * helper Method for Sum function
	 * 
	 * @param focusNode
	 * @return
	 */
	public int sumHelper(Node focusNode) {
		if (focusNode != null)
			sumOfNodes = sumOfNodes + focusNode.getValue();
		if (focusNode.getLeft() != null)
			sumHelper(focusNode.getLeft());
		if (focusNode.getRight() != null)
			sumHelper(focusNode.getRight());
		return sumOfNodes;
	}

	/**
	 * method to print maximum node in a tree
	 * 
	 * @param focusNode
	 */
	public void maxValue(Node focusNode) {

		if (focusNode != null) {

			maxValue(focusNode.getRight());
			if (focusNode.getMax() == true)
				System.out.println("\n\nThe max value is " + focusNode.getValue());

		}

	}

	/**
	 * method to update node values based on UpdateValue
	 * 
	 * @param focusNode
	 * @param updateValue
	 */
	public void update(Node focusNode, int updateValue) {
		if (focusNode != null) {

			if (focusNode.getLeft() != null)
				update(focusNode.getLeft(), updateValue);
			if (!focusNode.getMax()) {
				focusNode.setValue(focusNode.getValue() + updateValue);
			} else {
				focusNode.setValue((2 * updateValue) + focusNode.getValue());
			}
			focusNode.notifyAllObservers(updateValue);

			if (focusNode.getRight() != null)
				update(focusNode.getRight(), updateValue);
		}

	}

}
