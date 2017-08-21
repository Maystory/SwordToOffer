package cn.swun.swordToOffer;
/**

 * @author 梅凡
 *
 */
 class Node15{
	 String data;
	 Node15 next;
	 public Node15(){}
	 public Node15(String data){
		 this.data = data;
	 }
	 public void setData(String data) {
		this.data = data;
	}
	 public String getData() {
		return data;
	}
	 public void setNext(Node15 next) {
		this.next = next;
	}
	 public Node15 getNext() {
		return next;
	}
 }
public class Demo15 {
	public static void main(String[] args) {
		Node15 root = new Node15("A");
		Node15 node1 = new Node15("B");
		Node15 node2 = new Node15("C");
		Node15 node3 = new Node15("D");
		Node15 node4 = new Node15("E");	
		root.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
//		while(root!=null){
//			System.out.println(root.data);
//			root = root.getNext();
//			
//		}
		System.out.println(printNodeFromTailK(root, 6));
		
	}
	public static String printNodeFromTailK(Node15 root,int k){
		if(root==null){
			System.out.println("链表为空");
			return null;
			
		}
		if(k==0){
			System.out.println("K不能为0");
			return null;
		}
		Node15 temp1 = root;
		Node15 temp2 = null;
		for(int i=0;i<k-1;i++){
			if(temp1.getNext()==null){
				System.out.println("k不能大于链表的长度");
				return null;
				
			}
			temp1 = temp1.getNext();
			
		}
		temp2 = root;
		while(temp1.getNext()!=null){
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();			
        }
	  
		return temp2.data;
		
		
	}
		
		
		
		
}
