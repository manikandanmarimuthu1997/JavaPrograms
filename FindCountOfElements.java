public class FindCountOfElements {
	
	//To find the count of the numbers in a given int array without using collections.
	//The array contains 0s and 1s, and the array was always sorted.

	public static void main(String[] args) {
		int array[] = {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
		
		String str = "";
		
		for(int i: array) {
			str += i;
		}
		
		int count0 = str.substring(0,str.indexOf("1")).length();
		int count1 = str.substring(count0).length();
		
		System.out.println(count0);
		System.out.println(count1);
	}
}
