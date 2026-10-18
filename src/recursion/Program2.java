package recursion;

public class Program2 {
	public static void main(String[] arg) {
		int i = 1;
		int n = 5;
		
		solver(i, n);
	}
	
	private static void solver(int i, int n) {
		if(i > n) return;
		
		System.out.println(i);
		solver(i+1, n);
	}
}
