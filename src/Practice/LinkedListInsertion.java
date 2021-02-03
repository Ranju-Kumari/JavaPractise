package Practice;

public class LinkedListInsertion {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedListInsertion insert(LinkedListInsertion list,int d) {
		
		//Create the new node
		Node nodeToInsert = new Node(d);
		nodeToInsert.next = null;
		
		//If the list is empty, make the new node as the head
		if(list.head==null) {
			list.head = nodeToInsert;
		}else {
			//traverse to the last node
			Node nodeToTraverse = list.head; 
			while(nodeToTraverse.next!=null) {
				nodeToTraverse = nodeToTraverse.next;
			}
			System.err.println(list);
			//Then insert the new node
			nodeToTraverse.next = nodeToInsert;
		}
		//return list by head
		return list;
	}	
	
	public static void print(LinkedListInsertion list) {
		Node nodeToTraverse = list.head;
		while(nodeToTraverse!=null) {
			System.out.print(nodeToTraverse.data);
			nodeToTraverse = nodeToTraverse.next;
		}
	}
	
	public static void main(String [] args) {
		LinkedListInsertion list = new LinkedListInsertion();
		
		list = insert(list,10);
		list = insert(list,20);
		list = insert(list,30);
		
		print(list);
	}
	
}
	

