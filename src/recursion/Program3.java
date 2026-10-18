package recursion;

public class Program3 {
	public static void main(String[] arg) {
		int i = 1;
		int n = 5;
		
		solver(n, n);
	}
	
	private static void solver(int i, int n) {
		if(i == 0) return;
		
		System.out.println(i);
		solver(i-1, n);
	}
}
