package assignment5_ForLoop;

public class question_14 {

	public static void main(String[] args) {
		/*
		 * Write nested loop to draw this pattern

##
#  #
#   #
#    #
#     #
#      #
#        #
		 */

		
		
		for(int row=1 ; row<=7; row++) {
	System.out.print("#");
	
	for (int i = 1; i <= row; i++) {
		System.out.print(" ");
	}
	
	System.out.println("#");
	
	}
	}
}
