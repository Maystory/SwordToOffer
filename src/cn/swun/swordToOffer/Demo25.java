package cn.swun.swordToOffer;

import java.util.Stack;

public class Demo25 {
	public static void path(BinaryTreeNode root ,int i){
		if (root==null) {
			return;
		}
		Stack<Integer> stack = new Stack<>();
		int currSum = 0;
		findpath(root, i , stack, currSum);
		
	}
	public static void findpath(BinaryTreeNode root,int i ,Stack<Integer> stack,int currSum){
		currSum = currSum+root.getData();
		stack.push(root.getData());
		if (root.getLchild()==null&&root.getRchild()==null) {
			if (currSum==i) {
				System.out.println("查找到了");
				for(int path :stack){
					System.out.println(path+",");
				}
			}
			
		}
		if (root.getLchild()!=null) {
			findpath(root.getLchild(),i,stack,currSum);
		}
		if (root.getRchild()!=null) {
			findpath(root.getRchild(),i,stack,currSum);
		}
		currSum = currSum-root.getData();
		stack.pop();
	}
			public static void main(String[] args) {
				BinaryTreeNode root=new BinaryTreeNode(10);
				BinaryTreeNode node1=new BinaryTreeNode(5);
				BinaryTreeNode node2=new BinaryTreeNode(4);
				BinaryTreeNode node3=new BinaryTreeNode(7);
				BinaryTreeNode node4=new BinaryTreeNode(12);
				root.setLchild(node1);root.setRchild(node4);
				node1.setLchild(node2);node1.setRchild(node3);
				path(root,22);
			}
}
