package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Trees {
	static int SUM = 0;

	public static void main(String[] args) {
//		         [1]
//		        /   \
//		      [2]   [3]
//		      / \
//		    [4] [5]
//		    /     \
//		  [6]     [7]
//		  /         \
//		[8]         [9]

		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);

		// 2. Link them together
		a.nextLeft = b;
		a.nextRight = c;

		b.nextLeft = d;
		b.nextRight = e;

		d.nextLeft = f;
		e.nextRight = g;

		f.nextLeft = h;
		g.nextRight = i;
		int size = sizeOfTree(a);
		System.out.println("Size of the Binary tree is : " + size + " Nodes");

		int sum = sumOfTree(a);
		System.out.println("The sum of values in tree is : " + sum);

		int product = product(a);
		System.out.println("The product of the data is : " + product);

		int max = maxValue(a);
		System.out.println("The maximum value from the tree is : " + max);

		ArrayList<Integer> tree = new ArrayList<>();
		tree = preOrder(a, tree);
		System.out.println("Binary tree in Pre-order format is : " + tree);

		ArrayList<Integer> tree1 = new ArrayList<>();
		tree = inOrder(a, tree1);
		System.out.println("Binary tree in In-order format is : " + tree1);

		ArrayList<Integer> tree2 = new ArrayList<>();
		tree = postOrder(a, tree2);
		System.out.println("Binary tree in Post-order format is : " + tree2);

//		invertTree(a);
		ArrayList<Integer> tree3 = new ArrayList<>();
		tree = postOrder(a, tree3);
		System.out.println("Binary tree in Post-order format is : " + tree3);

		boolean ans = hasPathSum(a, 100);
		System.out.println("Atleast one branch of the tree has target sum : " + ans);

		System.out.print("The Binary Tree in level order ArrayList format is : ");
		levelOrderDisplay(a);

		System.out.println("The Binary Tree in level Order Format as a Tree is :- ");
		levelOrderDisplayFormatTwo(a);
		ArrayList<ArrayList<Integer>> z = levelOrderDisplayFormatThree(a);
		System.out.println("Binary tree in level Order Format is : " + z);

		ArrayList<ArrayList<Integer>> l = zigZagOrderTraversal(a);
		System.out.println("Binary tree in level Order Zig-Zag Format is : " + l);

		int level = 3;
		System.out.print("The elements of Binary Tree on level " + level + " are : [");
		elementsOfLevel(a, 0, level);
		System.out.println("]");

		ArrayList<ArrayList<Integer>> pathsArrayList = getAllPaths(a);
		System.out.println("All paths in the Binary Tree are : " + pathsArrayList);

		int targetSum = 8;
		ArrayList<ArrayList<Integer>> path = pathWithSum(a, targetSum);
		System.out.println("Path with sum " + targetSum + " is : " + path);

		int height = height(a);
		System.out.println("The height of the Binary Tree is : " + height);

		boolean balanced = balancedBinaryTree(a);
		System.out.println("The binary tree is balanced status : " + balanced);

		int diameter = diameterOfBinaryTree(a);
		System.out.println("The diamter of the Binary Tree is : " + diameter);

		ArrayList<Integer> rightViewElements = rightView(a);
		System.out.println("The elements from right view are : " + rightViewElements);
		
		Node n1 = h;
		Node n2 = i;
		Node ancestor = lowestCommonAncestor(a,n1,n2);
		System.out.println("The lowest Common Ancestor of "+n1.data+" & "+n2.data+" is : "+ancestor.data);

		Node a1 = new Node(1);
		Node b2 = new Node(2);
		Node c3 = new Node(3);
		Node d4 = new Node(3);
		Node e5 = new Node(4);
		Node f6 = new Node(4);
		Node g7 = new Node(5);
		a1.nextLeft = b2;
		a1.nextRight = c3;
		b2.nextLeft = d4;
		b2.nextRight = e5;
		c3.nextLeft = f6;
		c3.nextRight = g7;
		boolean answer = isIdentical(a, a1);
		String same = "Both the trees are identical";
		String notSame = "Both the Trees are non-identical";
		System.out.println(answer ? same : notSame);

	}

	static class Pair {
		Node node;
		int level;

		public Pair(Node node, int level) {
			this.node = node;
			this.level = level;
		}
	}

	public static void displayTree(Node root) {
		if (root == null) {
			System.out.print("-1 ");
			return;
		}
		System.out.print(root.data + " ");
		displayTree(root.nextLeft);
		displayTree(root.nextRight);
	}

	public static int sizeOfTree(Node root) {
		return (root == null) ? 0 : (1 + sizeOfTree(root.nextLeft) + sizeOfTree(root.nextRight));
	}

	public static int sumOfTree(Node root) {
		if (root == null) {
			return 0;
		}
//		 SUM = root.data+SUM;
//		sumOfTree(root.nextLeft);
//		sumOfTree(root.nextRight);
//		return SUM;

		return (root.data + sumOfTree(root.nextLeft) + sumOfTree(root.nextRight));
	}

	public static int product(Node root) {
		if (root == null) {
			return 1;
		}
		if (root.data != 0) {
			return (root.data * product(root.nextRight) * product(root.nextLeft));
		} else {
			return 1;
		}
	}

	public static int maxValue(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maxValue(root.nextLeft), maxValue(root.nextRight)));
	}

	public static ArrayList<Integer> preOrder(Node root, ArrayList<Integer> ans) {
		if (root == null) {

			return ans;
		}
		ans.add(root.data);
		preOrder(root.nextLeft, ans);
		preOrder(root.nextRight, ans);

		return ans;
	}

	public static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> ans) {
		if (root == null) {

			return ans;
		}
		inOrder(root.nextLeft, ans);
		ans.add(root.data);
		inOrder(root.nextRight, ans);

		return ans;
	}

	public static ArrayList<Integer> postOrder(Node root, ArrayList<Integer> ans) {
		if (root == null) {

			return ans;
		}
		postOrder(root.nextLeft, ans);
		postOrder(root.nextRight, ans);
		ans.add(root.data);

		return ans;
	}

	public static void invertTree(Node root) {

		if (root == null) {
			return;
		}
		Node temp = root.nextLeft;
		root.nextLeft = root.nextRight;
		root.nextRight = temp;
		invertTree(root.nextLeft);
		invertTree(root.nextRight);

	}

	public static boolean isIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if (root1 == null || root2 == null) {
			return false;
		}

		return (root1.data == root2.data) && isIdentical(root1.nextLeft, root2.nextLeft)
				&& isIdentical(root1.nextRight, root2.nextRight);

	}

	public static boolean isSymmetric(Node root) {
		invertTree(root.nextRight);
		return isIdentical(root.nextLeft, root.nextRight);
	}

	public static boolean hasPathSum(Node root, int targetSum) {
		if (root == null) {
			if (targetSum == 0) {
				return true;
			} else {
				return false;

			}

		}
		return (hasPathSum(root.nextLeft, targetSum - root.data) || hasPathSum(root.nextRight, targetSum - root.data));

	}

	public static void levelOrderDisplay(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		System.out.print("[");
		while (q.size() > 0) {
			Node frontNode = q.remove();
			System.out.print(frontNode.data + " ");
			if (frontNode.nextLeft != null)
				q.add(frontNode.nextLeft);
			if (frontNode.nextRight != null)
				q.add(frontNode.nextRight);
		}
		System.out.println("]");
	}

	public static void levelOrderDisplayFormatTwo(Node root) {
		int currentLevel = 0;

		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));
		while (q.size() > 0) {

			Pair frontPair = q.remove();
			if (frontPair.level != currentLevel) {
				currentLevel++;
				System.out.println();

			}
			System.out.print(frontPair.node.data + " ");
			if (frontPair.node.nextLeft != null)
				q.add(new Pair(frontPair.node.nextLeft, currentLevel + 1));
			if (frontPair.node.nextRight != null)
				q.add(new Pair(frontPair.node.nextRight, currentLevel + 1));

		}
		System.out.println();

	}

	public static ArrayList<ArrayList<Integer>> levelOrderDisplayFormatThree(Node root) {

		ArrayList<ArrayList<Integer>> super_list = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return super_list;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			ArrayList<Integer> sub_list = new ArrayList<Integer>();
			int nodesOnCurrentLevel = q.size();
			for (int i = 0; i < nodesOnCurrentLevel; i++) {

				Node currentNode = q.remove();
				sub_list.add(currentNode.data);

				if (currentNode.nextLeft != null) {
					q.add(currentNode.nextLeft);
				}
				if (currentNode.nextRight != null) {
					q.add(currentNode.nextRight);
				}

			}
			super_list.add(sub_list);
		}

		return super_list;
	}

	public static ArrayList<ArrayList<Integer>> zigZagOrderTraversal(Node root) {
		ArrayList<ArrayList<Integer>> super_list = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return super_list;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		boolean leftToRight = true;
		while (!q.isEmpty()) {

			ArrayList<Integer> sub_list = new ArrayList<Integer>();
			int nodesOnCurrentLevel = q.size();
			if (leftToRight == true) {
				for (int i = 0; i < nodesOnCurrentLevel; i++) {

					Node currentNode = q.remove();
					sub_list.add(currentNode.data);
					if (currentNode.nextLeft != null) {
						q.add(currentNode.nextLeft);
					}

					if (currentNode.nextRight != null) {
						q.add(currentNode.nextRight);
					}

				}
				super_list.add(sub_list);
				leftToRight = false;
			} else {
				for (int i = 0; i < nodesOnCurrentLevel; i++) {

					Node currentNode = q.remove();
					sub_list.add(0, currentNode.data);

					if (currentNode.nextLeft != null) {
						q.add(currentNode.nextLeft);
					}

					if (currentNode.nextRight != null) {
						q.add(currentNode.nextRight);
					}

				}
				leftToRight = true;
				super_list.add(sub_list);
			}

		}
		return super_list;

	}

	public static void elementsOfLevel(Node root, int currentLevel, int level) {
		if (root == null) {
			return;
		}
		if (currentLevel + 1 == level) {
			System.out.print(root.data + " ");
		}
		elementsOfLevel(root.nextLeft, currentLevel + 1, level);
		elementsOfLevel(root.nextRight, currentLevel + 1, level);

	}

	public static ArrayList<ArrayList<Integer>> getAllPaths(Node root) {
		ArrayList<ArrayList<Integer>> allPaths = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> currentPath = new ArrayList<Integer>();
		findPaths(root, currentPath, allPaths);
		return allPaths;

	}

	public static void findPaths(Node root, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> allPaths) {
		if (root == null) {
			return;
		}
		currentPath.add(root.data);
		if (root.nextLeft == null && root.nextRight == null) {
			allPaths.add(new ArrayList<Integer>(currentPath));
		} else {
			findPaths(root.nextLeft, currentPath, allPaths);
			findPaths(root.nextRight, currentPath, allPaths);
		}
		currentPath.remove(currentPath.size() - 1);

	}

	public static ArrayList<ArrayList<Integer>> pathWithSum(Node root, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> allPaths = getAllPaths(root);
		for (int i = 0; i < allPaths.size(); i++) {
			int sum = 0;
			for (int j = 0; j < allPaths.get(i).size(); j++) {
				sum = sum + allPaths.get(i).get(j);
			}
			if (sum == target) {
				result.add(allPaths.get(i));
			}
		}
		return result;
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}

		int lh = height(root.nextLeft);
		int rh = height(root.nextRight);

		return 1 + Math.max(lh, rh);

	}

	public static boolean balancedBinaryTree(Node root) {
		if (root == null) { // the leaf has 0rh and 0lh thus balanced & empty tree is balanced
			return true;
		}
		int rh = height(root.nextRight);
		int lh = height(root.nextLeft);
		if (Math.abs((rh - lh)) > 1) {
			return false;
		}
		return balancedBinaryTree(root.nextLeft) && balancedBinaryTree(root.nextRight);
	}

	public static int diameterOfBinaryTree(Node root) {

		if (root == null) {
			return 0;
		}
		int rl = height(root.nextLeft);
		int rh = height(root.nextRight);
		int currentDiameter = rl + rh + 1;
		int leftDiameter = diameterOfBinaryTree(root.nextLeft);
		int rightDiameter = diameterOfBinaryTree(root.nextRight);

		return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));

	}

	public static ArrayList<Integer> rightView(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> fullData = levelOrderDisplayFormatThree(root);

		for (int i = 0; i < fullData.size(); i++) {
			result.add(fullData.get(i).getLast());
		}

		return result;
	}

	public static Node lowestCommonAncestor(Node root, Node n1, Node n2) {
		if (root == null || n1.data==root.data || n2.data==root.data) {
			return root;
		}
		if (hasNode(root.nextRight, n1) && hasNode(root.nextLeft, n2)) {
			return root;
		}
		if (hasNode(root.nextRight, n2) && hasNode(root.nextLeft, n1)) {
			return root;
		}
		if (hasNode(root.nextLeft, n1) && hasNode(root.nextLeft, n2)) {
			return lowestCommonAncestor(root.nextLeft, n1, n2);

		}
		if (hasNode(root.nextRight, n1) && hasNode(root.nextRight, n2)) {
			return lowestCommonAncestor(root.nextRight, n1, n2);
		}
		return root;
	}

	public static boolean hasNode(Node root, Node n1) {
		if (root == null) {
			return false;
		}
		if (n1.data == root.data) {
			return true;
		}
		return hasNode(root.nextLeft, n1) || hasNode(root.nextRight, n1);
	}

}
