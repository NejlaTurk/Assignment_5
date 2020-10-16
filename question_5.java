package assignment5_ForLoop;

public class question_5 {

	public static void main(String[] args) {
		/*
		 * Question-5:
Print the table of 12 using for loop.
Output should be in following format:
12 X 1 = 12
12 X 2 = 24
12 X 3 = 36
12 X 4 = 48
12 X 5 = 60
12 X 6 = 72
12 X 7 = 84
12 X 8 = 96
12 X 9 = 108
12 X 10 = 120
		 */
		 for( int tableNum = 12 ; tableNum<=12 ; tableNum++) { 
			    
		       System.out.println("Multiplication table for " + tableNum);
		       
		       for (int i = 1; i <= 10; i++) {
		         
		         System.out.println(tableNum +  " X "+ i +"\t= " +  (tableNum * i )    );
		         
		       }
		    
	}

	}}
