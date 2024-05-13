package labs2;

public class Question2 {
	
	//the name of my stack is called "Question2"for purpose of convenience"
	
	    private int[] stackArray;
	    private int top;
	    private int capacity;

	    public Question2(int capacity) {
	        this.capacity = capacity;
	        this.stackArray = new int[capacity];
	        this.top = -1;
	    }


	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("stack is full");
	            return;
	        }
	        stackArray[++top] = element;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("stack is empty.");
	        }
	        return stackArray[top--];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }
	    public boolean isFull() {
	        return top == capacity - 1;
	    }

	    public static void main(String[] args) {
	    	Question2 stack = new Question2(5);
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	       //after its full
	        stack.push(60);

	        System.out.println(stack.pop());
	        System.out.println("is it empty:" + stack.isEmpty());
	    }
	}