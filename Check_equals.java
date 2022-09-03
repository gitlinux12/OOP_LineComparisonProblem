package LineComparisonProblem;

public class Check_equals {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");
		
		double line1X1 = 5.2;
		double line1Y1 = 4.2;
		double line1X2 = 1.9;
		double line1Y2 = 9.5;
		double line1_Length = (double) Math.sqrt(Math.pow(line1X2 - line1X1, 2) + Math.pow(line1Y2 - line1Y1, 2));
		System.out.println("First line point 1 is ("+line1X1+", "+line1Y1+"), point 2 is ("+line1X2+", "+line1Y2+") and length is "+line1_Length);
		
		double line2X1 = 5.2;
		double line2Y1 = 4.2;
		double line2X2 = 1.8;
		double line2Y2 = 9.7;
		double line2_Length = (double) Math.sqrt(Math.pow(line2X2 - line2X1, 2) + Math.pow(line2Y2 - line2Y1, 2));
		System.out.println("Second line point 1 is ("+line2X1+", "+line2Y1+"), point 2 is ("+line2X2+", "+line2Y2+") and length is "+line2_Length);
		
		if (line1_Length == line2_Length) {
			System.out.println("Both Lenth Of Lines are Equal ");
		}
		else {
			System.out.println("Length of Lines Are Not Equal");
		}
		}
	}


