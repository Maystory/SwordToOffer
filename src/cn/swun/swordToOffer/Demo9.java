package cn.swun.swordToOffer;

public class Demo9{
	 public static void main(String[] args){
    System.out.println(fibonacci(1675675));
	   
	 }
	 public static long fibonacci(int n){
		long[] a = {0,1};
		if(n<2){
			return a[n];
		}
		long fib1=0;
		long fib2=1;
		long fibn=0;
		for(int i=2;i<=n;i++){
			fibn = fib1+fib2;
			fib1=fib2;
			fib2=fibn;
		}
		return fibn;
	   }
	 
	}