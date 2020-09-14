package polymorphism;

public class TestLandCalculate {

	public static void main(String[] args) {
		LandCalculator areaOfLine = new LandCalculator();
		double sizeOfLand= areaOfLine.areaOfLand(5, 10);
		System.out.println(sizeOfLand);
		
		LandCalculator areaOfTriangle = new LandCalculator();
		double sizeOfTriangle= areaOfLine.areaOfLand(5, 10, 15);
		System.out.println(sizeOfTriangle);
		
		LandCalculator areaOfRectangle = new LandCalculator();
		double sizeOfRectangle= areaOfLine.areaOfLand(5, 10, 15, 11);
		System.out.println(sizeOfRectangle);
		
		ModernLandCalculator mlc = new ModernLandCalculator();
		double sizeOfModernCalculate = mlc.areaOfLand(5, 10, 15, 11);
		System.out.println(sizeOfModernCalculate);

	}

}
