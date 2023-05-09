package inheritance.org;

public class Cuffia extends Prodotto{

	private String color;
	private boolean wireless;
	
	public Cuffia(String name, String brand, Double price, int vat, String color, boolean wireless) {
		super(name, brand, price, vat);
		
		setColor(color);
		setWireless(wireless);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		return "(C)" + getProdottoString()
		+ "\nColore: " + getColor()
		+ "\nWireless: " + isWireless();
	}

}
