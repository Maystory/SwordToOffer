package cn.swun.swordToOffer;

public class Demo10 {
	  public static int getNum(int n){
		  int count = 0;
		  if(n==0){
			  return 0;
		  }
		  while(n!=0){
			  count++;
			  n=(n-1)&n;
		  }
		  return count;
	  }

	public static void main(String[] args) {
	   System.out.println(getNum(0));

	}

}
