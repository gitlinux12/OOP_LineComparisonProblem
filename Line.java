package LineComparisonProblem;

public class Line {
	
		public Point point1;
		public Point point2;
		
		Line(Point point1, Point point2) {
			this.point1 = point1;
			this.point2 = point2;
		}
		
		public double length() {
			return (double) Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
		}
		
		public boolean equals(Line line) {
			return this.length() == line.length();
		}
		
		public int compareTo(Line line) {
			double thisLength = this.length();
			double lineLength = line.length();
			return thisLength == lineLength ? 0 : (thisLength > lineLength ? 1 : -1);
		}
	}

