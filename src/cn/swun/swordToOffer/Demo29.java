package cn.swun.swordToOffer;

import java.util.HashMap;
import java.util.Map;

public class Demo29 {
	  public static void whichMath(int[] arr){
		  int len = arr.length/2;
		  Map<Integer,Integer> map = new HashMap<>();
		  int i = 0;
		  while (i<arr.length) {
			  
			if(!map.isEmpty()){
				if (map.containsKey(arr[i])) {
					int value = map.get(arr[i])+1;
					map.put(arr[i], value);
					if(value>len){
						System.out.println(arr[i]);
						break;
					}
					
				}else{
					map.put(arr[i], 1);
				}
			}else{
				map.put(arr[i], 1);
			}
			
			i++;
			
		}
		  System.out.println(map);
	  }
	public static void main(String[] args) {
	  int [] arr = {2,4,3,4,5,6,2,2,2,2,2,2,2,2,2,2,2,3,4,6,2};
	  whichMath(arr);
	  System.out.println("结束");
	}

}
