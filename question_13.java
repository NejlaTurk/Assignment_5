package assignment5_ForLoop;

public class question_13 {

	public static void main(String[] args) {
		/*
		 * Print following chessboard using nested for loops.
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
		 */
	
	for (int row =1 ; row<= 8 ; row++) {
		if (row %2==1){
		
		for (int col = 1 ; col <=8 ; col++) {
		if (col %2 ==1) {
			System.out.print("w");
		}else  {
			System.out.print("B");
		}
		System.out.print(" ");
		}
		}else {
	
	for (int col = 1 ; col <=8 ; col++) {
		if (col %2 ==1) {
			System.out.print("B");
		}else  {	
			System.out.print("W");
		}
		System.out.print(" ");
	}
		}
	System.out.println();	
	}
		



}}