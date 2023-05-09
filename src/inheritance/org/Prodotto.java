package inheritance.org;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private Double price;
	private int vat;
	
	public Prodotto(
			String name, 
			String brand, 
			Double price, 
			int vat) {
		
		Random rnd = new Random();
		this.code = rnd.nextInt(1,1000);
		this.name = name;
		this.brand = brand; 
		this.price = price; 
		this.vat = vat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getFullPrice() {
		return price + (price*vat)/100;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public int getCode() {
		return code;
	}
	
	protected String getProdottoString() {
		
		return getCode() + " " + getName()
		+ "\nMarca: " + getBrand()
		+ "\nPrezzo: €" + String.format("%.2f", getPrice())
		+ "\nIva: " + getVat()+"%"
		+ "\nPrezzo con iva: €" + String.format("%.2f", getFullPrice()) ;
	}
	
	@Override
	public String toString() {
		return "(P)" + getProdottoString();
	}
	
}
