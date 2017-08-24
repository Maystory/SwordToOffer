package cn.swun.swordToOffer;

public class Demo24 {
	private static boolean verfiySequenceOfBST(int[] array,int start ,int end) {
		
		if(array==null||start>end||start<0||end<0)
				return false;
		
		if(start==end)
			return true;
		
			int root=array[end];
			
			int i=start;
			for(;i<=end;i++){
				if(array[i]>root)
					break;
			}
			
			int j=i;
			for(;j<=end;j++){
				if(array[j]<root)
					return false;
			}
			
			boolean left=true;
			if(i>start){
				left=verfiySequenceOfBST(array,start,i-1);
			}
			
			boolean right=true;
			if(i<end){
				
				right=verfiySequenceOfBST(array,i,end-1);
			}
			return (left&&right);
		}


	public static void main(String[] args) {
		int[] array={5,7,6,9,11,10,8};
		   // int[] array={7,4,6,5};
			
			boolean b=verfiySequenceOfBST(array,0,6);
			System.out.println(b);

	}

}
