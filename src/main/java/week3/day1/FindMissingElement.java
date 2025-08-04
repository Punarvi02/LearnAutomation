package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,4,3,2,8,6,7};
		
		Arrays.sort(array);          //{1,2,3,4,6,7,8}
		
		for(int i=1; i<array.length; i++) {
			
			if(i != array[i-1]) {
				
				System.out.println(i);
				break;
			}
			
				
			
			
		}
			

	}
	

}
