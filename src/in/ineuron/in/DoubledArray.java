package in.ineuron.in;
import java.util.*;
public class DoubledArray {
       public static int[] findOriginalArray(int[] changed) {
	        if (changed.length % 2 != 0) {
	            return new int[0]; // changed array length must be even for it to be a doubled array
	        }

	        Map<Integer, Integer> countMap = new HashMap<>();
	        for (int num : changed) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        Arrays.sort(changed);

	        int[] original = new int[changed.length / 2];
	        int idx = 0;
	        for (int num : changed) {
	            if (countMap.getOrDefault(num, 0) == 0) {
	                continue; // skip if the number is already used
	            }

	            int doubledNum = num * 2;
	            countMap.put(num, countMap.get(num) - 1); // decrease the count of the number in the map
	            if (countMap.getOrDefault(doubledNum, 0) == 0) {
	                return new int[0]; // doubled number not found in the map, not a doubled array
	            }
	            countMap.put(doubledNum, countMap.get(doubledNum) - 1); // decrease the count of the doubled number

	            original[idx++] = num;
	        }

	        return original;
	    }

	    public static void main(String[] args) {
	        int[] changed = {1, 3, 4, 2, 6, 8};
	        int[] original = findOriginalArray(changed);
	        System.out.println(Arrays.toString(original));
	    }
	}


