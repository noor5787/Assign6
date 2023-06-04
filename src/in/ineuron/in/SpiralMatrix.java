package in.ineuron.in;

public class SpiralMatrix {

	    public static void main(String[] args) {
	        int n = 3;
	        int[][] matrix = generateSpiralMatrix(n);
	        
	        // Print the generated matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public static int[][] generateSpiralMatrix(int n) {
	        int[][] matrix = new int[n][n];
	        int num = 1;
	        int rowStart = 0;
	        int rowEnd = n - 1;
	        int colStart = 0;
	        int colEnd = n - 1;
	        
	        while (rowStart <= rowEnd && colStart <= colEnd) {
	            // Traverse right
	            for (int i = colStart; i <= colEnd; i++) {
	                matrix[rowStart][i] = num++;
	            }
	            rowStart++;
	            
	            // Traverse down
	            for (int i = rowStart; i <= rowEnd; i++) {
	                matrix[i][colEnd] = num++;
	            }
	            colEnd--;
	            
	            // Traverse left
	            if (rowStart <= rowEnd) {
	                for (int i = colEnd; i >= colStart; i--) {
	                    matrix[rowEnd][i] = num++;
	                }
	                rowEnd--;
	            }
	            
	            // Traverse up
	            if (colStart <= colEnd) {
	                for (int i = rowEnd; i >= rowStart; i--) {
	                    matrix[i][colStart] = num++;
	                }
	                colStart++;
	            }
	        }
	        
	        return matrix;
	    }
	}


