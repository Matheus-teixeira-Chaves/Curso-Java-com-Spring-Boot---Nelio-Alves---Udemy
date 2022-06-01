package entity;

public class Retangulo {

	public double width;
	public double height;
	public double resultArea;
	
	public double area (double width, double height) {
		return  resultArea = width * height; 
	}
	
	public double perimeter (double width, double height) {
		return resultArea = (width + width) + (height + height);
	}
	
	public double diagonal  (double width, double height) {
		return resultArea = Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
	}
}