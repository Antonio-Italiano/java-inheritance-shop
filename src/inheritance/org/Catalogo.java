package inheritance.org;

import java.util.Scanner;

import inheritance.org.Prodotto;
import inheritance.org.Smarphone;
import inheritance.org.Televisore;
import inheritance.org.Cuffia;

public class Catalogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Prodotto[] prodotti = new Prodotto[100];
		int count = 0;

		while(true) {

			System.out.println("Che genere di prodotto vuoi inserire:");
			System.out.println("1 - generico");
			System.out.println("2 - smartphone");
			System.out.println("3 - televisore");
			System.out.println("4 - cuffia");
			System.out.println("5 - uscire");
			System.out.println("-------------------");

			int choice = sc.nextInt();

			if (choice < 1 || choice > 5) {

				System.err.println("Scelta non trovata");

				continue;
			}

			switch (choice) {
				case 1: {
					System.out.println("Inserire Nome");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.println("Inserire Brand");
					String brand = sc.nextLine();
					
					System.out.println("Inserire Prezzo");
					Double price = sc.nextDouble();
					
					System.out.println("Inserire Iva");
					int vat = sc.nextInt();
					
					Prodotto p1 = new Prodotto(name, brand, price, vat);
					System.out.println(p1);	
					System.out.println("------------------");
					
					prodotti[count]= p1;
					count++;
				}
				break;
				case 2: {
					System.out.println("Inserire Nome");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.println("Inserire Brand");
					String brand = sc.nextLine();
					
					System.out.println("Inserire Prezzo");
					Double price = sc.nextDouble();
					
					System.out.println("Inserire Iva");
					int vat = sc.nextInt();
					
					System.out.println("Inserire Spazio di memoria");
					int memorySpace = sc.nextInt();
					
					Smarphone s1 = new Smarphone(name, brand, price, vat, memorySpace);
					System.out.println(s1);
					System.out.println("------------------");
					
					prodotti[count]= s1;
					count++;
				}
				break;
				case 3: {
					System.out.println("Inserire Nome");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.println("Inserire Brand");
					String brand = sc.nextLine();
					
					System.out.println("Inserire Prezzo");
					Double price = sc.nextDouble();
					
					
					System.out.println("Inserire Iva");
					int vat = sc.nextInt();	
					
					System.out.println("Inserire Dimensioni");
					int dimension = sc.nextInt();
					
					System.out.println("Inserire se smart");
					boolean isSmart = sc.nextBoolean();
					
					Televisore t1 = new Televisore(name, brand, price, vat, dimension, isSmart);
					System.out.println(t1);
					System.out.println("------------------");
					
					prodotti[count]= t1;
					count++;
					
				}
				break;
				case 4: {
					System.out.println("Inserire Nome");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.println("Inserire Brand");
					String brand = sc.nextLine();
					
					System.out.println("Inserire Prezzo");
					Double price = sc.nextDouble();
					
					System.out.println("Inserire Iva");
					int vat = sc.nextInt();	
					
					System.out.println("Inserire Colore");
					String color = sc.nextLine();
					sc.nextLine();
					System.out.println("Inserire se wireless");
					boolean wireless = sc.nextBoolean();
					
					Cuffia c1 = new Cuffia(name, brand, price, vat, color, wireless);
					System.out.println(c1);
					System.out.println("------------------");
					prodotti[count]= c1;
					count++;
					
				}
				break;
				case 5:
					System.out.println("Catalogo");
					for(int x = 0; x< count; x++) {
						System.out.println(prodotti[x]);
						System.out.println("---------");
					};
					sc.close();
					return;
			}
		}

	}
}
