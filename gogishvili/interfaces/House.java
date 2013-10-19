package gogishvili.interfaces;

public class House implements Printable {
	
	private double area;
	
	private int roomCount;
	
	private double price;
	
	public void print() {
		System.out.println("Area: " + area + "; Room count: " + roomCount + "; Price: " + price + "; ");
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
