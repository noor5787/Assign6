package in.ineuron.in;
import java.util.*;
public class PermutationReconstruction {
       public static int[] reconstructPermutation(String s) {
	        int n = s.length();
	        int[] perm = new int[n + 1];
	        
	        // Initialize the permutation
	        for (int i = 0; i <= n; i++) {
	            perm[i] = i;
	        }
	        
	        // Reconstruct the permutation
	        int start = 0;
	        int end = 0;
	        
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == 'I') {
	                // If the character is 'I', reverse the subarray from start to end
	                reverse(perm, start, end);
	                end++;
	            } else {
	                // If the character is 'D', increment the end pointer
	                end++;
	            }
	        }
	        
	        // Reverse the last subarray if necessary
	        reverse(perm, start, end);
	        
	        return perm;
	    }
	    
	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	    
	    public static void main(String[] args) {
	        String s = "IDID";
	        int[] perm = reconstructPermutation(s);
	        
	        System.out.println(Arrays.toString(perm));
	    }
	}


