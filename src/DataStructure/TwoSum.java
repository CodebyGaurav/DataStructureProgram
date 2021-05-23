package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	    public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i< nums.length; i++){
	            int potentialMatch = target-nums[i]; // =9-2
	             if(map.containsKey(potentialMatch)) { 

	            	 System.out.println(map.containsKey(potentialMatch)); //7
	            	 
	            	 System.out.println(map.get(potentialMatch));
	            	 return new int [] {map.get(potentialMatch), i};
	             }
	               
	           System.out.println("A : "+map.put(nums[i], i)); 
	        }
	        return new int[] {0, 0};
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {2,7,11,15}; int target = 9;
		twoSum(nums, target);
		
	}

}
