import java.util.*;
class CountSubtree
{
static class Node
{
	int data;
	Node left, right;
}
static class INT
{
	int v;
	INT(int a)
	{
		v = a;
	}
}
static Node getNode(int data)
{
	Node newNode = new Node();
	newNode.data = data;
	newNode.left = newNode.right = null;
	return newNode;
}
static int countSubtreesWithSumX(Node root,INT count, int x)
{
	if (root == null)
		return 0;
	int ls = countSubtreesWithSumX(root.left,count, x);
	int rs = countSubtreesWithSumX(root.right,count, x);
	int sum = ls + rs + root.data;
	if (sum == x)
		count.v++;
	return sum;
}
static int countSubtreesWithSumXUtil(Node root,int x)
{
	if (root == null)
		return 0;
	INT count = new INT(0);
	int ls = countSubtreesWithSumX(root.left,count, x);
	int rs = countSubtreesWithSumX(root.right,count, x);
	if ((ls + rs + root.data) == x)
		count.v++;
	return count.v;
}

public static void main(String args[])
{
	/* binary tree creation
			 5
			/ \
		-10	 3
		/ \ / \
		9 8 -4 7
	*/

	Node root = getNode(5);
	root.left = getNode(-10);
	root.right = getNode(3);
	root.left.left = getNode(9);
	root.left.right = getNode(8);
	root.right.left = getNode(-4);
	root.right.right = getNode(7);
	int x = 7;
	System.out.println("Count = " +countSubtreesWithSumXUtil(root, x));
}
}

