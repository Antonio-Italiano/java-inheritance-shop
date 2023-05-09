package inheritance.org;

public class Televisore extends Prodotto {

	private int dimension;
	private boolean isSmart;
	
	public Televisore(String name, String brand, Double price, int vat, int dimension, boolean isSmart) {
		super(name, brand, price, vat);

		setDimension(dimension);
		setSmart(isSmart);
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	@Override
	public String toString() {
		return "(T)" + getProdottoString()
		+ "\nDimensioni: " + getDimension() + " pollici"
		+ "\nSmart: " + isSmart();
	}

}
