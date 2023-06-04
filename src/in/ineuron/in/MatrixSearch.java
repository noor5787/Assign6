package in.ineuron.in;

public class MatrixSearch {

	    public static boolean searchMatrix(int[][] matrix, int target) {
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return false;
	        }
	        
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int low = 0;
	        int high = rows * cols - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int midValue = matrix[mid / cols][mid % cols];
	            
	            if (midValue == target) {
	                return true;
	            } else if (midValue < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        
	        return false;
	    }
	    
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 3, 5, 7},
	            {10, 11, 16, 20},
	            {23, 30, 34, 60}
	        };
	        int target = 3;
	        
	        boolean result = searchMatrix(matrix, target);
	        System.out.println(result);
	    }
	}


