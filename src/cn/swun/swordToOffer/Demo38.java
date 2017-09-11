package cn.swun.swordToOffer;

public class Demo38 {
	public static void main(String[] args) {
		int[] array={1,2,3,3,3,3,4,5};
		System.out.println(getNumberOfK(array, 3));
	}
	public static int getNumberOfK(int[] nums,int key){
		 if (nums.length==0) {
			return -1;
		}
		 int index1 =getFirstK(nums,0,nums.length-1,key);
		 int index2 =getLastK(nums,0,nums.length-1,key);
		 if(index1==-1||index2==-1){
			 return -1;
		 }
		return index2-index1+1;
	}
	public static int getFirstK(int[] nums,int start,int end,int key){
		if(start<end){
			int mid = (start+end)/2 ;
			
			if(key==nums[mid]){
				if(key!=nums[mid-1]){
					return mid;
				}else {
					mid = mid-1;
				}
			}
			if(key>nums[mid]){
				mid = (mid+1+end)/2;
				return getFirstK(nums,mid,end,key);
			}else{
				mid = (start+mid-1)/2;
				return getFirstK(nums,start,mid,key);
			}
		}
		return -1;
	
	}
	//
	public static int getLastK(int[] nums,int start,int end,int key){
		if(start<end){
			int mid = (start+end)/2 ;
			
			if(key==nums[mid]){
				if(key!=nums[mid+1]){
					return mid;
				}else {
					mid = mid+1;
				}
			}
			if(key>nums[mid]){
				mid = (mid+1+end)/2;
				return getFirstK(nums,mid,end,key);
			}else{
				mid = (start+mid-1)/2;
				return getFirstK(nums,start,mid,key);
			}
		}
		return -1;
	
	}
}
