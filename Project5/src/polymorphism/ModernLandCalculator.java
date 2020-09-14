package polymorphism;

public class ModernLandCalculator extends LandCalculator {
	public double areaOfLand(double a, double b, double c, double d) {
		double total= a + b + c + d -4; 
		return total;
	}

}
