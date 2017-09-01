package cn.swun.swordToOffer;

public class Demo29_2 {
	//找到最后一次把次数设置为1的数据  即使数组中出现次数超过一半的数字
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println(findNum(arr));
	}
	public static int findNum(int[] arr){
		if(arr==null){
			System.out.println("数组为空！");
			return -1;
		}
		int result = arr[0];
		int count = 1;
		for(int i=1;i<arr.length;i++){
			if(count==0){
				result = arr[i];
				count = 1;
			}
			else if(arr[i]==result){
				count++;
			}else{
				count--;
			}
		}
		return result;
	}
}
