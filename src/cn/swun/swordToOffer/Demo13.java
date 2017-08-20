package cn.swun.swordToOffer;

public class Demo13{
	public static void delete(MyNode root,MyNode node){
		if(node.getNext()==null){
			while(root.getNext()!=node){
				root=root.getNext();
			}
				root.next=null;
		}else if(root==node){
			root=null;
		}else{
			node.setData(node.getNext().getData());
			node.setNext(node.getNext().getNext());
			node.getNext().getNext();

		}

	}
 public static void main(String[] args){
	    MyNode a = new MyNode("A");
		MyNode b = new MyNode("B");
		MyNode c = new MyNode("C");
		MyNode d = new MyNode("D");
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		delete(a,d);
		MyNode temp = a;
		while(temp!=null){
			System.out.println(temp.getData());
			temp= temp.getNext();
		}

	}
}
class MyNode{
	 String data;
	 MyNode next;
	public MyNode(){}
	public MyNode(String data){
		this.data = data;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return data;
	}
	public void setNext(MyNode next){
		this.next = next;

	}
	public MyNode getNext(){
		return next;
	}
}