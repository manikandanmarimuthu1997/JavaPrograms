import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSumOftwoNumbers {
	
//	Find which two elements of the sum in an array equal the given number.
//  Without using two for loops and using collections.

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int num = 5;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		List<Integer> result = new ArrayList<Integer>();
		result.add(0);
		result.add(1);
		
		for (int i = 0; i < list.size(); i++) {
			if(map.containsKey(list.get(i))) {
				int temp = map.get(list.get(i));
				result.set(0, temp);
				result.set(1, i);
			} else {
				map.put(num-list.get(i), i);
			}
		}

		System.out.println(result);
	}
}
