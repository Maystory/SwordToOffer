package cn.swun.swordToOffer;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 从上往下打印出二叉树的每个结点，同一层的结点按照从左到右的顺序打印
 * @author 梅凡
 *
 */

public class Demo23 {
	public static void printFromTop(BinaryTreeNode node1){
		if (node1==null) {
			return ;
		}
		Queue<BinaryTreeNode> que = new LinkedList<>();
		que.add(node1);
		while(!que.isEmpty()){
			BinaryTreeNode temp = que.poll();
			System.out.println(temp.getData());
			if (temp.Lchild!=null) {
				que.add(temp.getLchild());
			}
			if (temp.getRchild()!=null) {
				que.add(temp.getRchild());
			}
		}
		
	}
		public static void main(String[] args) {
			BinaryTreeNode node1=new BinaryTreeNode(8);
			BinaryTreeNode node2=new BinaryTreeNode(6);
			BinaryTreeNode node3=new BinaryTreeNode(10);
			BinaryTreeNode node4=new BinaryTreeNode(5);
			BinaryTreeNode node5=new BinaryTreeNode(7);
			BinaryTreeNode node6=new BinaryTreeNode(9);
			BinaryTreeNode node7=new BinaryTreeNode(11);
			node1.setLchild(node2);node1.setRchild(node3);
			node2.setLchild(node4);node2.setRchild(node5);
			node3.setLchild(node6);node3.setRchild(node7);
			
			printFromTop(node1);
		}
}
