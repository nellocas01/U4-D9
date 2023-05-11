package group;

public class Order {
	// Attributi di istanza
	private long id;
	private String status;
	private String name;
	private String category;
	private double price;

	// costruttore
	public Order(String name, String category, double price) {
		this.id = 974123658l;
		this.status = "";
		setPrice(price);
		setCategory(category);
		setName(name);
	}

	@Override
	public String toString() {
		return this.name + this.category + this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setCategory(String category) {
		// TODO Auto-generated method stub
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
