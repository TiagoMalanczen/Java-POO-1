package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
		
	}
	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValues() {
		return hours;
	}
	public void setValues(Integer values) {
		this.hours = values;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Double payment() {
		return this.valuePerHour*this.hours;
	}
	
}
