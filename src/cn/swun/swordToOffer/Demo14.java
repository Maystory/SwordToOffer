package cn.swun.swordToOffer;
/**
 * 
 * @author 梅凡
 *
 *
*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */

public class Demo14 {
	public static void mySort(int[] arr){
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			while(left<right&&!isEven(arr[left])){
				left++;
				
			}
			while(left<right&&isEven(arr[right])){
				right--;	
			}
			if(left<right){
				int temp = arr[right];
				arr[right]=arr[left];
				arr[left]= temp;
				
			}
			if(left>=right){
				break;
				
			}
		}
		
	}
	/**
	 * 判断是否是偶数
	 * @param data
	 * @return
	 */
	public static boolean isEven(int data){
		return data%2==0;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		mySort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		

	}

}
