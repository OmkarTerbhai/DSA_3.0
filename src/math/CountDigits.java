package math;

public class CountDigits {
	public static void main(String[] arg) {
		int iNo = 7789;
		System.out.print(solver(iNo));
	}
	
	private static int solver(int iNo) {
		if(iNo == 0) return 1;
		int iCnt = 0;
		while(iNo != 0) {
			iCnt++;
			iNo /= 10;
		}
		return iCnt;
	}
}
