package basics;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public double totalValueInStock() {
		return this.quantity * this.price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		if (this.quantity < quantity) {
			System.out.println("Quantidade insuficiente.");
		}
		this.quantity = this.quantity - quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product Data: " + this.name + ", $ " + this.price + ", " + this.quantity + " units ," + " Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}

}
