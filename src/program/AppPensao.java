package program;

import java.util.Scanner;

import entity.PensaoCadastro;

public class AppPensao {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("How many rooms will be rented? ");
			n = sc.nextInt();
		} while (n < 1 || n > 10);

		PensaoCadastro[] psc = new PensaoCadastro[n];
		
		
		for (int i = 0; i < psc.length; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String mail = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			psc[i] = new PensaoCadastro(name, mail, room);
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("------------------------------------");
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < psc.length; i++) {
			if (psc[i] != null) {
				System.out.println(psc[i]);
				
			}
		}
	}

}
