package in.ineuron.in;
import java.util.HashMap;
public class MaxLengthContiguousSubarray {
	

	
	    public static int findMaxLength(int[] nums) {
	        // Create a HashMap to store the count and index difference
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int count = 0;
	        int maxLength = 0;
	        map.put(0, -1); // Initialize the HashMap with an initial count and index difference
	        
	        // Traverse through the array
	        for (int i = 0; i < nums.length; i++) {
	            // Increment the count if the element is 1, otherwise decrement it
	            count += (nums[i] == 1) ? 1 : -1;
	            
	            // Check if the current count exists in the HashMap
	            if (map.containsKey(count)) {
	                // Calculate the length of the subarray with equal 0s and 1s
	                maxLength = Math.max(maxLength, i - map.get(count));
	            } else {
	                // If the count is not present, store it with the current index
	                map.put(count, i);
	            }
	        }
	        
	        return maxLength;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {0, 1};
	        int maxLength = findMaxLength(nums);
	        System.out.println("Maximum length of a contiguous subarray: " + maxLength);
	    }
	}


