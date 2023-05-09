package inheritance.org;

import inheritance.org.Prodotto;
import inheritance.org.Smarphone;
import inheritance.org.Televisore;
import inheritance.org.Cuffia;

public class Shop {

	public static void main(String[] args) {
System.out.println("------------------------------------\n");
		
		Prodotto p1 = new Prodotto("Play Station", "Sony", 499.99, 22);
		System.out.println(p1);
		
		System.out.println("\n------------------------------------\n");
		
		Smarphone s1 = new Smarphone("Iphone 13", "Apple", 879.99, 22, 1000);
		System.out.println(s1);
		
		System.out.println("\n------------------------------------\n");
		
		Televisore t1 = new Televisore("LG 32LQ63006LA", "LG", 1260.00, 22, 160, true);
		System.out.println(t1);
		
		System.out.println("\n------------------------------------\n");
		
		Cuffia c1 = new Cuffia("Samsung 32LQ63006LA", "Samsung", 126.80, 22, "green" , true);
		System.out.println(c1);
		
		System.out.println("------------------------------------\n");
	}
}
