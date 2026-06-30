package package3;

public class Queues {
	static class Node {
		int data;
		Node right;
		Node left;

		Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}
	
	static class BinaryTree
	{
		static int index = -1;
		static Node buildTree(int[] treeData)
		{
			index++;
			if(treeData[index] == -1)
			{
				return null;
			}
			Node node = new Node(treeData[index]);
			node.left = buildTree(treeData);
			node.right = buildTree(treeData);
			
			return node;
		}
	}

	public static void main(String[] args) {
		int[] treeData = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root  = tree.buildTree(treeData);
		System.out.println(root.data);
		
		

	}

}
