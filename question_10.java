package assignment5_ForLoop;

public class question_10 {

	public static void main(String[] args) {
		/*
		 * Print following output using nested for loops:
1
22
333
4444
55555
666666
7777777
	 */

		for (int row=1 ; row <=7; row++) {
		
		int lastNum= row;
		
		for (int i =1 ; i<=lastNum; i++) {
			
			System.out.print(lastNum);
		
		}
		System.out.println();
		}}}