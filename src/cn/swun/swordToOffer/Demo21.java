package cn.swun.swordToOffer;

import java.util.Stack;

class MyStack{
	private Stack<Integer> stack ,helpStack;
	public MyStack(){
		stack = new Stack<>();
		helpStack = new Stack<>();
		
	}
	public void pop(){
		stack.pop();
		helpStack.pop();
	}
	public void push(int num){
		stack.push(num);
		if (helpStack.size()==0 || num<helpStack.peek()) {
			
			helpStack.push(num);
		}else{
			helpStack.push(stack.peek());
		}
		
	}
	public void min(){
		helpStack.peek();
		
	}
}

public class Demo21 {

	public static void main(String[] args) {
           MyStack ms = new MyStack();
           ms.push(3);
           ms.push(4);
           ms.push(2);
           ms.push(1);
           
           
	}

}
