package inheritance.org;

import java.util.Random;

public class Smarphone extends Prodotto {

	private int codeImei;
	private int memorySpace;
	
	public Smarphone(String name, String brand, Double price, int vat, int memorySpace) {
		super(name, brand, price, vat);

		Random rnd = new Random();
		this.codeImei = rnd.nextInt(100000,9000000);
		setMemorySpace(memorySpace);
		
	}

	public int getCodeImei() {
		return codeImei;
	}

	public void setCodeImei(int codeImei) {
		this.codeImei = codeImei;
	}

	public int getMemorySpace() {
		return memorySpace;
	}

	public void setMemorySpace(int memorySpace) {
		this.memorySpace = memorySpace;
	}
	
	@Override
	public String toString() {
		return "(S)" + getProdottoString()
		+ "\nCodice IMEI: " + getCodeImei()
		+ "\nSpazio di memoria: " + getMemorySpace();
	}

}
