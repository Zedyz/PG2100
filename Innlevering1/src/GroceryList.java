// Fredrik Jørgensen Olsen

public class GroceryList {

	int antallVarer = 0;
	
	GroceryItem [] liste;
	
	// Konstruktør med en default verdi på 10 plasser
	
	public GroceryList()	{
		
		this(10);
	}

	// Konstruktør med en definert verdi
	
	public GroceryList(int handleliste) {


		liste = new GroceryItem[handleliste];
	}
	
	// Metode for å legge til verdier i listen
	
	public boolean addItem(GroceryItem groceryitem)		{
		
		if(antallVarer < liste.length)	{
			
			liste[antallVarer] = groceryitem;
			antallVarer++;
			return true;
		}
		
		return false;
	}
	
	// Metode for å fjerne verdier i listen
	
	public boolean removeItem(String name)	{
		
		for(int i = 0; i < antallVarer; i++)	{
			
			if(liste[i].getName().equalsIgnoreCase(name))	{
				
				// Flytter alle verdiene et hakk i lista etter verdien man ber om har blitt fjernet
				
				for(int j = i; j < antallVarer; j++)	{
				
					liste[j] = liste[j + 1];
				}
			
				antallVarer--;
				return true;
			}
		}
		
		return false;
	}
	
	// Regner ut den totale konstaden
	
	public double getTotalCost()	{
		
		double total = 0;
		
		for(int i = 0; i < antallVarer; i++)	{
			
			total += liste[i].getCost();
		}
		
		return total;
	}
	
	// Returnerer en formatert string med hele handlelisten
	
	public String toString()	{
		
		String alleVarene = "";
		
		for(int i = 0; i < antallVarer; i++)	{
			
			alleVarene += liste[i].toString() + "\n";
		}
		
		alleVarene += String.format("Samlet kostnad: %.2f", getTotalCost());
		
		return alleVarene;
	}
}
