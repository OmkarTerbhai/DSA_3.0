package recursion;

public class Program5 {
	public static void main(String[] arg) {
		int i = 1;
		int n = 5;
		
		solver(i, n);
	}
	
	private static void solver(int i, int n) {
		if(i > n) return;
		
		solver(i+1, n);
		System.out.println(i);
	}
}
