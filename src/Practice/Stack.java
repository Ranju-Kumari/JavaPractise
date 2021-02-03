package Practice;

public class Stack {

	
	public static void main(String [] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}
	
	int top =-1;
	int max = 5;
	int stack[] = new int[max];
	
	public void push(int item) {
		if(isFull()) {
			throw new RuntimeException("Stack is full");
		}
		stack[++top] = item;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stak is underflow"); 
		}
		
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stak is underflow"); 
		}
		return stack[top];
	}
	
	public boolean isFull() {
		if(top>max-1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(top<0) 
			return true;
		return false;
	}
}
