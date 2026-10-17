package math;

public class PalindromeNumber {
	public static void main(String[] arg) {
		int iNo = 11;
		System.out.print(solver(iNo));
	}
	
	private static boolean solver(int iNo) {
		if(iNo == 0) return true;
		int iTemp = iNo;
		int iRes = 0;
		while(iNo != 0) {
			int digit = iNo % 10;
			iRes = (iRes * 10) + digit;
			iNo /= 10;
		}
		return iRes == iTemp;
	}
}
