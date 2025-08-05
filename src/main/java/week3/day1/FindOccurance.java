package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "TestLeaf";
		int j=0;
		char target = 'e';
		
		
		char[] charArray = input.toCharArray(); //{T,e,s,t,L,e,a,f}
		
		for(int i=0; i<charArray.length; i++) {
			
			if (charArray[i] == target) {
				j++;
				
			}
			
		}
      System.out.println("Total count is"+" "+j);
	}

}
