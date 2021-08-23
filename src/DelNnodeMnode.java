
import java.util.*;
class DelNnodeMnode
{

static class Node
{
	int data;
	Node next;
};
static Node push( Node head_ref, int new_data)
{
	/* allocate node */
  Node temp=head_ref;
	Node new_node = new Node();
	/* put in the data */
	new_node.data = new_data;
	/* link the old list off the new node */
	new_node.next = null;
	/* move the head to point to the new node */
  if(head_ref==null)
	head_ref = new_node;
  else
  {
  while(temp.next!=null)
  {
    temp=temp.next;
  }
  temp.next=new_node;
}
return head_ref;
}
/* Function to print linked list */
static void printList( Node head)
{
	Node temp = head;
	while (temp != null)
	{
		System.out.printf("%d ", temp.data);
		temp = temp.next;
	}
	System.out.printf("\n");
}
static void skipMdeleteN( Node head, int M, int N)
{
	Node curr = head, t;
	int count;
	while (curr!=null)
	{

		for (count = 1; count < M && curr != null; count++)
			curr = curr.next;

		if (curr == null)
			return;
		
		t = curr.next;
		for (count = 1; count <= N && t != null; count++)
		{
			Node temp = t;
			t = t.next;
		}
		curr.next = t;
		curr = t;
	}
}
// Driver code
public static void main(String args[])
{
	/* Create following linked list
	1.2.3.4.5.6.7.8.9.10 */
	Node head = null;
	int M=2, N=2;
Scanner sc=new Scanner(System.in);
int data;
do{
  data=sc.nextInt();
  if(data>0)
  head=push(head, data);
}while(data>0);
	System.out.printf("M = %d, N = %d \nGiven" +"Linked list is :\n", M, N);
	printList(head);
	skipMdeleteN(head, M, N);
	System.out.printf("\nLinked list after deletion is :\n");
	printList(head);
}
}
