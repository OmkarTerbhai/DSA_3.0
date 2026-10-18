package math;

public class ArmstrongNumber {
	public static void main(String[] arg) {
		int iNo = 1634;
		System.out.print(solver(iNo));
	}
	
	private static boolean solver(int iNo) {
		if(iNo == 1 || iNo == 0) return true;
		
		int iAns = iNo;
		int iSum = 0;
		int n = digitCnt(iNo);
		while(iNo != 0) {
			int digit = iNo % 10;
			iSum += Math.pow(digit, n);
			iNo /= 10;
		}
		System.out.print(iSum);
		return iAns == iSum;
	}
	
	private static int digitCnt(int iNo) {
		if(iNo == 0) return 1;
		int iCnt = 0;
		while(iNo != 0) {
			iCnt++;
			iNo /= 10;
		}
		return iCnt;
	}
}
