package math;
import java.util.*;
import java.math.*;

public class FindFactors {
	public static void main(String[] arg) {
		int iNo = 74;
		System.out.print(solver(iNo));
	}
	
	private static Set<Integer> solver(int iNo) {
		Set<Integer> st = new HashSet<>();
		if(iNo == 0 || iNo == 1) return Set.of(iNo);
		
		for(int i = 1; i <= Math.sqrt(iNo); i++) {
			if(iNo % i == 0) {
				st.add(i);
				st.add((iNo / i));
			}
		}
		return st;
	}
}
