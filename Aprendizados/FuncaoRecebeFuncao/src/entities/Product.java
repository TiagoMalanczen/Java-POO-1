package entities;

public class Product {

	private String name;
	private Double priece;
	public Product(String name, Double priece) {
		super();
		this.name = name;
		this.priece = priece;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPriece() {
		return priece;
	}
	public void setPriece(Double priece) {
		this.priece = priece;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", priece=" + priece + "]";
	}
}
