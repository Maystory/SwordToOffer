package cn.swun.swordToOffer;
/**
 * 连续子数组的最大和
 * @author 梅凡
 *
 */
public class Demo31 {
	public static void main(String[] args) {
		int[] arr={1,-2,3,10,-4,7,2,-5};
		System.out.println(maxSub(arr));
	}
	public static int maxSub(int[] arr){
		int len = arr.length;
		int sum = 0;
		int max = 0;
		for(int i=0;i<len;i++){
			sum = arr[i]+sum;
			if (sum>max) {
				max=sum;
			}else if(sum<0){
				sum = 0;
			}
		}
		
		return max;
	}
}
