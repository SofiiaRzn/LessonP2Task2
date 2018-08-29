package yahoo.sofiia.riazanova;

public class Triangle {
	private double sideFirst;
	private double sideSecond;
	private double sideThird;
	private double perimeter;
	private double area;
	
	public Triangle(double sideFirst, double sideSecond, double sideThird) {
		this.sideFirst = sideFirst;
		this.sideSecond = sideSecond;
		this.sideThird = sideThird;
	}

	public Triangle() {
	}

	public double getSideFirst() {
		return sideFirst;
	}

	public void setSideFirst(double sideFirst) {
		this.sideFirst = sideFirst;
	}

	public double getSideSecond() {
		return sideSecond;
	}

	public void setSideSecond(double sideSecond) {
		this.sideSecond = sideSecond;
	}

	public double getSideThird() {
		return sideThird;
	}

	public void setSideThird(double sideThird) {
		this.sideThird = sideThird;
	}
	public double calculatePerimeter (Triangle triangle) {
		perimeter = triangle.sideFirst+triangle.sideSecond+triangle.sideThird;
	return perimeter;}
	
	public double calculateArea (Triangle triangle) {
		calculatePerimeter(triangle);
		double halfPerimeter = triangle.perimeter/2;
		area = Math.sqrt( halfPerimeter * (halfPerimeter-triangle.sideFirst)*(halfPerimeter - triangle.sideSecond)*(halfPerimeter-triangle.sideThird));
	return area;
	}
	

}
