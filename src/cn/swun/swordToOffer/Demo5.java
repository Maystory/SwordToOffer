package cn.swun.swordToOffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class Node{
	private String data;
	private Node next;
	public Node(){}
	public Node(String data){
		this.data = data;	
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		Node root = new Node("A");
		Node node1 = new Node("B");
		Node node2 = new Node("C");
		Node node3 = new Node("D");
		root.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
	  List<Node> list = printListFromTail(root);
	  for (Node node : list) {
		System.out.println(node.getData()+",");
	}
	  System.out.println("----------华丽的分割线----------");
	 printNode(reverse(root));

	}
	//使用stack 来反向输出一个链表
	public static List printListFromTail(Node root){
		Stack<Node> stack = new Stack<>();
		List<Node> list = new ArrayList<>();
		if(root==null){
			return null;
		}
			while(true){
				stack.push(root);
				root = root.getNext();
			    if(root==null){
			    	break;
			    }	
		}
		
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
	}
	//改变指向来反向输出一个链表
	public static Node reverse(Node root){
		if(root.getNext()==null){
			return root;
		}
		Node reverseHead=reverse(root.getNext());
		root.getNext().setNext(root);
		root.setNext(null);
		
		return reverseHead;
	}
	public static void printNode(Node node){
		System.out.println(node.getData()+",");
		if(node.getNext()!=null){
			printNode(node.getNext());
			
		}
	}

}
