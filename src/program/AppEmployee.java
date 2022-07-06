package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Employee;
import entity.OutsourcedEmployee;

public class AppEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		Integer employeesQuantitys = sc.nextInt();

		for (int i = 1; i <= employeesQuantitys; i++) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n) ? ");
			char outsourced = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Hours: ");
			Integer hours = sc.nextInt();

			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println();
		
		System.out.println("#################################");
		System.out.println("PAYMENTS:");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}
