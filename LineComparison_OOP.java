package LineComparisonProblem;


public class LineComparison_OOP {
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Problem");
		
		// Line 1
		Line line1 = new Line(new Point(5.8, 4.2), new Point(1.9, 9.7));
		System.out.println("First line point 1 is "+line1.point1.toString()+", point 2 is "+line1.point2.toString()+" and length is "+line1.length());
	
		// Line 2
		Line line2 = new Line(new Point(4.8, 6.7), new Point(1.2, 9.4));
		System.out.println("Second line point 1 is "+line2.point1.toString()+", point 2 is "+line2.point2.toString()+" and length is "+line2.length());
		
		if (line1.equals(line2)) {
			System.out.println("Both lines are equal by equals method");
		} else {
			System.out.println("Both lines are not equal by equals method");
		}
		
		switch (line1.compareTo(line2)) {
		case 0:
			System.out.println("Both lines are equal by compare to method");
			break;
		case 1:
			System.out.println("Line 1 is greater than line 2 by compare to method");
			break;
		case -1:
			System.out.println("Line 1 is less than line 2 by compare to method");
		}
	}

}

