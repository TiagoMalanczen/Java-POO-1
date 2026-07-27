package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Workerlevel;

public class Worker {

	private String name;
	private Workerlevel level;
	private Double basicSalary;
	
	private Department depertament;
	private List<HourContract> contracts = new ArrayList<>(); 
	
	public Worker() {
		
	}

	public Worker(String name, Workerlevel level, Double basicSalary, Department depertament) {
		super();
		this.name = name;
		this.level = level;
		this.basicSalary = basicSalary;
		this.depertament = depertament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Workerlevel getLevel() {
		return level;
	}

	public void setLevel(Workerlevel level) {
		this.level = level;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Department getDepertament() {
		return depertament;
	}

	public void setDepertament(Department depertament) {
		this.depertament = depertament;
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = this.basicSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValues();
			}
		}
		
		return sum;
	}
}
