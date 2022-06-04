package program;

import java.util.Locale;
import java.util.Scanner;

import entity.ClienteBanco;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		ClienteBanco clienteBanco;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String holder = scan.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble(); 
			clienteBanco = new ClienteBanco(number, holder, initialDeposit);
		} 
		else {
			clienteBanco = new ClienteBanco(number, holder);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(clienteBanco);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = scan.nextDouble();
		clienteBanco.deposit(depositValue);
		System.out.println("Updated Account Data:");
		System.out.println(clienteBanco);
		
		
		System.out.println();
		System.out.print("Enter a withDraw value: ");
		double withDraw = scan.nextDouble();
		clienteBanco.withdraw(withDraw);
		System.out.println("Updated Account Data:");
		System.out.println(clienteBanco);
		
		scan.close();

	}

}
