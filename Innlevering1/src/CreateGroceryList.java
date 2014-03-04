// Fredrik J�rgensen Olsen

public class CreateGroceryList {

	public static void main(String[] args) {
		
		GroceryList liste = new GroceryList();
		
		// Lager varer/verdiene
		
		GroceryItem br�d = new GroceryItem("Br�d", 2, 9.99);
		GroceryItem melk = new GroceryItem("Melk", 1, 9.99);
		GroceryItem syltet�y = new GroceryItem("Syltet�y", 2, 15.99);
		GroceryItem katt = new GroceryItem("Katt", 1, 99.99);
		GroceryItem ris = new GroceryItem("Ris", 4, 3.99);
		
		// Putter varene i handlelisten
		
		liste.addItem(br�d);
		liste.addItem(melk);
		liste.addItem(syltet�y);
		liste.addItem(katt);
		liste.addItem(ris);
		
		// Liste f�r fjerning
		System.out.println(liste.toString() + "\n");
		
		liste.removeItem("katt");
		
		// Liste etter katten er fjernet
		
		
		System.out.println(liste.toString());
	}
}
