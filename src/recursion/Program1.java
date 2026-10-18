package recursion;

public class Program1 {
	public static void main(String[] arg) {
		String str = "lolwut";
		int n = 5;
		
		solver(str, n);
	}
	
	private static void solver(String str, int n) {
		if(n == 0) return;
		
		System.out.println(str);
		solver(str, n - 1);
	}
}
