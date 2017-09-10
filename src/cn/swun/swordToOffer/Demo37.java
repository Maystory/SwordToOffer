package cn.swun.swordToOffer;
/**
 * 
 * 两链表的第一个公共节点
 * @author 梅凡
 * 1,找出链表的长度，用长的链表减去短的链表就是相差的数目
 * 2，然后减去相差后的节点数后开始同时遍历两个链表，如果两个链表的节点是相同的，那么此时的节点就是公共的节点
 *
 */
class ListNode{
	int data;
	ListNode nextNode;
}
public class Demo37 {
	
	public static void main(String[] args) {
		ListNode head1 = new ListNode();
		ListNode second1 = new ListNode();
		ListNode third1 = new ListNode();
		ListNode forth1 = new ListNode();
		ListNode fifth1 = new ListNode();
		ListNode head2 = new ListNode();
		ListNode second2 = new ListNode();
		ListNode third2 = new ListNode();
		ListNode forth2 = new ListNode();
		head1.nextNode = second1;
		second1.nextNode = third1;
		third1.nextNode = forth1;
		forth1.nextNode = fifth1;
		head2.nextNode = second2;
		second2.nextNode = forth1;
		third2.nextNode = fifth1;
		head1.data = 1;
		second1.data = 2;
		third1.data = 3;
		forth1.data = 6;
		fifth1.data = 7;
		head2.data = 4;
		second2.data = 5;
		third2.data = 6;
		forth2.data = 7;
		System.out.println(findFirstCommonNode(head1,head2).data);
	}
	public static ListNode findFirstCommonNode(ListNode head1, ListNode head2) {
		int len1 = getListLength(head1);
		int len2 = getListLength(head2);
		ListNode LongList = null;
		ListNode ShortList = null;
		int diff=0;
		if(len1>len2){
			 diff = len1-len2;
			 LongList = head1;
			 ShortList = head2;
			
		}else{
			 diff = len2-len1;
			 LongList = head2;
			 ShortList = head1;
		}
		
		for(int i =0;i<diff;i++){
			LongList = LongList.nextNode;
		}
		while(LongList!=null&&ShortList!=null&&LongList!=ShortList){
			LongList = LongList.nextNode;
			ShortList = ShortList.nextNode;
		}
		
		
		
		return LongList;
	}
	public static int getListLength(ListNode root){
		if(root==null){
			return 0;
		}
		int result = 0;
		while(root.nextNode!=null){
			root = root.nextNode;
			result++;
		}
		return result;
	}

}
