package in.ineuron.in;
import java.util.Arrays;

public class MinimumProductSum {

	    public static int minimumProductSum(int[] nums1, int[] nums2) {
	        Arrays.sort(nums1); // Sort nums1 in ascending order
	        Arrays.sort(nums2); // Sort nums2 in ascending order
	        
	        int n = nums1.length;
	        int minProductSum = 0;
	        
	        for (int i = 0; i < n; i++) {
	            minProductSum += nums1[i] * nums2[n - i - 1];
	        }
	        
	        return minProductSum;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums1 = {5, 3, 4, 2};
	        int[] nums2 = {4, 2, 2, 5};
	        
	        int result = minimumProductSum(nums1, nums2);
	        System.out.println("Minimum product sum: " + result);
	    }
	}


