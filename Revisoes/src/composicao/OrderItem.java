package composicao;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public double subTotal() {
		return this.price*this.quantity;
	}

	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append(getProduct().getName() + " R$: ");
		sb.append(String.format("%.2f", this.price));
		sb.append(" Quantity: ");
		sb.append(this.quantity);
		sb.append(" Sub total R$: " + String.format("%.2f", this.subTotal()));
		
		return sb.toString();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}
	
	
}
