// Fredrik Jørgensen Olsen

public class CreateGroceryList {

	public static void main(String[] args) {
		
		GroceryList liste = new GroceryList();
		
		// Lager varer/verdiene
		
		GroceryItem brød = new GroceryItem("Brød", 2, 9.99);
		GroceryItem melk = new GroceryItem("Melk", 1, 9.99);
		GroceryItem syltetøy = new GroceryItem("Syltetøy", 2, 15.99);
		GroceryItem katt = new GroceryItem("Katt", 1, 99.99);
		GroceryItem ris = new GroceryItem("Ris", 4, 3.99);
		
		// Putter varene i handlelisten
		
		liste.addItem(brød);
		liste.addItem(melk);
		liste.addItem(syltetøy);
		liste.addItem(katt);
		liste.addItem(ris);
		
		// Liste før fjerning
		System.out.println(liste.toString() + "\n");
		
		liste.removeItem("katt");
		
		// Liste etter katten er fjernet
		
		
		System.out.println(liste.toString());
	}
}
