package cn.swun.swordToOffer;

public class Demo4{
	 public static void main(String[] args){
		String str = " 第三方 水电费 ";
		System.out.println(Rep(str));

	 }
	 public static String Rep(String str){

	   String temp = str.replace(" ","%20");
	   return temp;
	 }
	 
	}
