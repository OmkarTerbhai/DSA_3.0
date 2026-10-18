package recursion;

public class Program6 {

	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(solver(0, arr));
	}
	
	private static int solver(int i, int[] arr) {
		if(i == arr.length-1) return arr[i];
		
		return arr[i] + solver(i+1, arr);
	}
}
