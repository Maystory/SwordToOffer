package cn.swun.swordToOffer;
class BinaryTreeNode {
	int data ;
	BinaryTreeNode Lchild;
	BinaryTreeNode Rchild;
	public BinaryTreeNode(){}
	public BinaryTreeNode(int data){
		this.data = data ;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLchild() {
		return Lchild;
	}
	public void setLchild(BinaryTreeNode lchild) {
		Lchild = lchild;
	}
	public BinaryTreeNode getRchild() {
		return Rchild;
	}
	public void setRchild(BinaryTreeNode rchild) {
		Rchild = rchild;
	}
	
}


public class Demo18 {

	/**
	 * 输入两颗二叉树A和B，判断B是不是A的子结构
	 */
	public static void main(String[] args) {
		
		BinaryTreeNode node1=new BinaryTreeNode(8);
		BinaryTreeNode node2=new BinaryTreeNode(8);
		BinaryTreeNode node3=new BinaryTreeNode(7);
		BinaryTreeNode node4=new BinaryTreeNode(9);
		BinaryTreeNode node5=new BinaryTreeNode(2);
		BinaryTreeNode node6=new BinaryTreeNode(4);
		BinaryTreeNode node7=new BinaryTreeNode(7);
		node1.setLchild(node2);node1.setRchild(node3);
		node2.setLchild(node4);node2.setRchild(node5);
		node5.setLchild(node6);node5.setRchild(node7);
		
		BinaryTreeNode a=new BinaryTreeNode(8);
		BinaryTreeNode b=new BinaryTreeNode(9);
		BinaryTreeNode c=new BinaryTreeNode(2);
		a.setLchild(b);a.setRchild(c);
		System.out.println(hasSubTree(node1,a));
	}

	private static boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		boolean result=false;
		if(root1!=null&&root2!=null){
			if(root1.getData()==root2.getData()){
				result=doseTree1HaveTree2(root1,root2);
				if(!result){
					result=hasSubTree(root1.getLchild(), root2);
				}
				if(!result)
					result=hasSubTree(root1.getRchild(), root2);
			}
		}
		return result;
		
	}

	private static boolean doseTree1HaveTree2(BinaryTreeNode root1,
			BinaryTreeNode root2) {
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.getData()!=root2.getData()){
			return false;
		}
		
		return doseTree1HaveTree2(root1.getLchild(), root2.getLchild())
				&&doseTree1HaveTree2(root1.getRchild(), root2.getRchild());
	}

}
