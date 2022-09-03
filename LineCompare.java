package LineComparisonProblem;

public class LineCompare {

	double line1X1 = 8.4;
	double line1Y1 = 5.4;
	double line1X2= 2.5;
	double line1Y2 = 4.8;

	double line2X1 = 8.2;
	double line2Y1= 3.7;
	double line2X2= 1.8;
	double line2Y2 = 4.4;



	public static void main(String[] args) {
		
	

		LineCompare compareTwoLines = new LineCompare();

		double Line1_Length = (double) Math.sqrt(Math.pow(compareTwoLines.line1X2 - compareTwoLines.line1X1, 2) + Math.pow(compareTwoLines.line1Y2 - compareTwoLines.line1Y1, 2));

	//compareTwoLines.z1 = Double.valueOf(Line1_Length);

	System.out.println("Line1_Length");
	System.out.println(Line1_Length);
	double Line2_Length = (double) Math.sqrt(Math.pow(compareTwoLines.line2X2 - compareTwoLines.line2X1, 2) + Math.pow(compareTwoLines.line2Y2 - compareTwoLines.line2Y1, 2));

	//compareTwoLines.z2 = Double.valueOf(Line2_Length);

	System.out.println("Line2_Length");
	System.out.println(Line2_Length);

		// System.out.println(z1);
		// System.out.println(z2);

	//System.out.println(compareTwoLines.z1.compareTo(compareTwoLines.z2)); // if z2--> greater thn -ve , if
																				// z1-->greater thn +ve value

	if (Line1_Length == Line2_Length) {
		System.out.println("Both lines are equal");
	} else if (Line1_Length > Line2_Length) {
		System.out.println("Line 1 is greater than line 2");
	} else {
		System.out.println("Line 1 is less than line 2");
	}
	}
}
