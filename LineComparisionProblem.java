package LineComparisonProblem;

public class LineComparisionProblem {
	int line1X1=2;
	int line1X2=5;
	int line1Y1=3;
	int line1Y2=4;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome To Line Comparision Problem");
		
		LineComparisionProblem length= new LineComparisionProblem();
		  float Line1_Length =  (float) Math.sqrt( Math.pow (length.line1X2 - length.line1X1 ,2) + Math.pow (length.line1Y2- length.line1Y1 , 2));	
		
		  System.out.println("Line point 1 is ("+length.line1X1+", "+length.line1Y1+"), point 2 is ("+length.line1X2+", "+length.line1Y2+") and length of Line is "+Line1_Length);
	}

}
