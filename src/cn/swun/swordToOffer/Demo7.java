package cn.swun.swordToOffer;

import java.util.Stack;
@SuppressWarnings("all")
public class Demo7{
	
	private Stack s1 = new Stack();
	private Stack s2 = new Stack();
	public void appendTail(Object x){
		s1.push(x);
	}
	public void deletedHead(){
		if(s1.size()==0&&s2.size()==0){
			System.out.println("队列为空");
		}else{
		   if(s2.size()!=0){
			   System.out.println(s2.peek().toString());
			   s2.pop();		   
		   }else{
			   while(s1.size()>0){
				   s2.push(s1.pop());
			   }
			   System.out.println(s2.peek().toString());
			   s2.pop();
		   }
		}
	}
	public static void main(String args[]){
		Demo7 que = new Demo7();
		que.appendTail("1");
		que.appendTail("2");
		que.appendTail("3");
		que.appendTail("4");
		que.appendTail("a");
		que.appendTail("b");
		que.deletedHead();
		que.deletedHead();
		que.deletedHead();
		que.deletedHead();
		que.deletedHead();
		que.deletedHead();
		que.deletedHead();
	
	
	}
}