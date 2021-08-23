import java.util.Scanner;

class LinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int item) { 
            data = item; 
            next = null; 
        } 
    } 
    void rearrange(Node odd) { 
          
        if (odd == null || odd.next == null || odd.next.next == null) { 
            return; 
        } 
        Node even = odd.next; 
        odd.next = odd.next.next; 
        odd = odd.next; 
        even.next = null; 
        while (odd != null && odd.next != null) { 
               
            Node temp = odd.next.next;
            odd.next.next = even; 
            even = odd.next;
            odd.next = temp; 
            if (temp != null) { 
                odd = temp; 
            } 
        }  
        odd.next = even; 
    } 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
        LinkedList list = new LinkedList();
        list.head= new Node(1);
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(5); 
        list.head.next.next.next.next.next = new Node(6); 
        list.head.next.next.next.next.next.next = new Node(7); 
        System.out.println("Linked list before calling rearrange : "); 
        list.printList(head); 
        
        System.out.println(""); 
        list.rearrange(head); 
  
        System.out.println("Linked list after calling rearrange : "); 
        list.printList(head); 
  
    } 
} 