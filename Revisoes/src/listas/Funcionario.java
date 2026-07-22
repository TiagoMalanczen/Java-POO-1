package listas;

public class Funcionario {

	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void aumentarSalario(double porcentagem) {
		this.salary += this.salary * porcentagem/100;
	}
}
