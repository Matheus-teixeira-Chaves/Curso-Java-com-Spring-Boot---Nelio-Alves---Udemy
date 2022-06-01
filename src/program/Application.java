package program;

import java.util.Locale;
import java.util.Scanner;

import entity.Retangulo;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Retangulo rect = new Retangulo();
		
		System.out.println("Digite à Altura:");
		double x = scan.nextDouble();
		System.out.println("Digite à Largura:");
		double y = scan.nextDouble();
		scan.close();
		
		rect.area(x, y);
		
		System.out.printf("AREA = %.2f%n", rect.resultArea);
		
		rect.perimeter(x, y);
		System.out.printf("PERIMETER = %.2f%n", rect.resultArea);
		
		rect.diagonal(x, y);
		System.out.printf("DIAGONAL = %.2f%n", rect.resultArea);
		
			
	}

}
