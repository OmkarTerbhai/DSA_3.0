package recursion;

public class Program4 {
	public static void main(String[] arg) {
		int i = 1;
		int n = 5;
		
		solver(n, n);
	}
	
	private static void solver(int i, int n) {
		if(i == 0) return;
		
		solver(i-1, n);
		System.out.println(i);
	}
}
