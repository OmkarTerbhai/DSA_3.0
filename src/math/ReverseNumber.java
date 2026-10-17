package math;

public class ReverseNumber {
	public static void main(String[] arg) {
		int iNo = 7789;
		System.out.print(solver(iNo));
	}
	
	private static int solver(int iNo) {
		if(iNo == 0) return 1;
		int iRes = 0;
		while(iNo != 0) {
			int digit = iNo % 10;
			iRes = (iRes * 10) + digit;
			iNo /= 10;
		}
		return iRes;
	}
}
