package pojo;

public class Vihicle {

	private String owner;

	private String type;

	private double capacity; // sức chứa

	private double price;

	private double tax;

	public Vihicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vihicle(String owner, String type, double capacity, double price) {
		super();
		this.owner = owner;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		this.tax = calculateTax(price, capacity);
	}

	public Vihicle(String owner, String type, double capacity, double price, double tax) {
		super();
		this.owner = owner;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double calculateTax(double price, double capacity) {
		if (capacity < 100) {
			return price * 0.01;
		} else if (100 <= capacity && capacity <= 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}

	@Override
	public String toString() {
		return "Vihicle [owner=" + owner + ", type=" + type + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax + "]";
	}

}
