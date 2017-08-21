package cn.swun.swordToOffer;
class Node17{
	int data;
	Node17 next;
	public Node17(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node17 getNext() {
		return next;
	}
	public void setNext(Node17 next) {
		this.next = next;
	}
	
}
public class Demo17 {
	       Node17 root = null;
	public static Node17 merge(Node17 root1,Node17 root2){
		if(root1==null&&root2==null){
			return null;	
		}
		if(root1==null&&root2!=null){
			return root2;
		}
		if(root2==null&&root1!=null){
			return root1;
		}
		Node17 head = root1.getData()>root2.getData()?root2:root1;
		Node17 index1 = head.getNext();
		Node17 index2 =head==root1?root2:root1;
		while(index1!=null&index2!=null){
			if(index1.getData()<index2.getData()){
				head.setNext(index1);
				index1=index1.getNext();
				
			}else{
				head.setNext(index2);
				index2=index2.getNext();
			}
			head = head.getNext();
		}
		if (index1==null) {
			while(index2!=null){
				head.setNext(index2);
				index2 = index2.getNext();
				head = head.getNext();
			}
					
		}else{
			while(index1!=null){
				head.setNext(index1);
				index1=index1.getNext();
				head = head.getNext();
			
			}
			
		}
		
		return root1.getData()>root2.getData()?root2:root1;
		
	}

	public static void main(String[] args) {
		Node17 node1=new Node17(1);
		Node17 node2=new Node17(3);
		Node17 node3=new Node17(5);
		Node17 node4=new Node17(7);
		node1.setNext(node2);node2.setNext(node3);node3.setNext(node4);
		Node17 node5=new Node17(2);
		Node17 node6=new Node17(4);
		Node17 node7=new Node17(6);	
		node5.setNext(node6);node6.setNext(node7);
		Node17 head=merge(node1,node5);		
		while(head!=null){
			System.out.print(head.getData()+" ");
			head=head.getNext();
		}

	}

}
