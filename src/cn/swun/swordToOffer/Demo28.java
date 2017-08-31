package cn.swun.swordToOffer;

public class Demo28 {
	public static void allPrint(String str){
		if(str==null){
			return ;
			
		}
		char[] arr = str.toCharArray();
		int i =0;
		while(i<=arr.length-1){
			for(int j=i;j<arr.length;j++){
				char temp = arr[i];
				arr[i] =arr[j];
				arr[j]=temp;
				System.out.println(new String(arr));
				temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				
			}
			i++;
		}
		
		
	}
	public static void main(String[] args) {
		String str = "abcdefg";
		allPrint(str);
	}

}
