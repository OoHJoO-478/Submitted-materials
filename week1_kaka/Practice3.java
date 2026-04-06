package week1_kaka;

public class Practice3 {

	 public static int findMax(int[] array) {
	        int max = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 3, 9, 1, 7};

	        System.out.println("Maximum value in the array: " + findMax(array));
	    }
}
