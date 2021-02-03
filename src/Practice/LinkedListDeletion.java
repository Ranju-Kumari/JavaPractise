package Practice;

public class LinkedListDeletion {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		public static LinkedListDeletion insert(LinkedListDeletion list, int d) {
			
			Node nodeToInsert = new Node(d);
			nodeToInsert.next = null;
			
			if(list .head==null) {
				list.head = nodeToInsert;
			}else {
				
				Node currentNode = list.head;
				while(currentNode.next!=null) {
					currentNode = currentNode.next;
				}
				
				currentNode.next = nodeToInsert;
			}
			return list;
		}
		
		public static void print(LinkedListDeletion list) {
			
			Node currentNode = list.head;
			while(currentNode!=null) {
				System.out.print(currentNode.data+" ");
				currentNode = currentNode.next;
			}
		}
		
		public static LinkedListDeletion delete(LinkedListDeletion list,int key) {
			
			Node currentNode = list.head;
			Node prev = null;
			
			if(currentNode!=null && currentNode.data==key) {
				list.head = currentNode.next;
				System.out.println(key+ " deleted");
				return list;
			}
			
			while(currentNode!=null && currentNode.data!=key) {
				prev = currentNode;
				currentNode = currentNode.next;
			}
			
			if(currentNode!=null) {
				prev.next = currentNode.next;
				System.out.print(key+" found and deleted");
			}
			
			if(currentNode==null) {
				System.out.println(key+" not found");
			}
			
			return list;
		}
		
		public static void main(String args[]) {
			LinkedListDeletion list = new LinkedListDeletion();
			
			list = insert(list,11);
			list = insert(list,12);
			list = insert(list,13);
			list = insert(list,14);
			list = insert(list,15);
			
			print(list);
			
			list  = delete(list, 13);
			print(list);
			
		}
}
