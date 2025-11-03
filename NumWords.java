public class NumWords {
	public static void main(String args[]) {
		
	    // Replace this comment with your code
		
			int a = Integer.parseInt(args[0])	;
			
			int hundreds= a/100;
			int unit =a%10;
			int tens =(a/10)%10;

			System.err.println(hundreds+ " hundreds, "+tens +" tens, "+ unit + " and ones.");
			

	}
}
