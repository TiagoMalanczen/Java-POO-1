package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.Workerlevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter departaments name: ");
		String departament_name = sc.nextLine();
		
		System.out.println("Eneter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Basic salary: ");
		double basic_salary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, Workerlevel.valueOf(workerLevel), basic_salary, new Department(departament_name));
		
		System.out.println("How many contracts to this worker");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.print("Enter contract #"+ i +" data:");
			System.out.print("Date (DD/MM/YYYY) :");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour");
			double valueHour = sc.nextDouble();
			System.out.print("Duration: (Hours)");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valueHour, hours);
			worker.addContract(contract);
		} 
		 
		System.out.println();
		 
		System.out.print("Enter month and year to calculate income (MM/YYYY) :");
		sc.nextLine();
		String monthAndYear = sc.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name = " + worker.getName());
		System.out.println("Departament = " + worker.getDepertament().getName());
		System.out.println("Income for " + monthAndYear + " : " + String.format( "%.2f ", worker.income(year, month)));
		
		sc.close(); 
		
	}
}
