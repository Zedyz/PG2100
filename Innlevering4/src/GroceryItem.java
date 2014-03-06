// Fredrik Jørgensen Olsen

public class GroceryItem {

	private String name;
	private int quantity;
	private double pricePerUnit;
	
	// Default verdier
	
	public GroceryItem()	{
		
		this(" ", 0, 0.0);
	}

	// Kontruktører
	
	public GroceryItem(String name, int quantity, double pricePerUnit) {
		
		setName(name);
		setQuantity(quantity);
		setPricePerUnit(pricePerUnit);
	}
	
	// Set metodene

	private void setName(String name) {
		
		this.name = name;
		
	}

	private void setQuantity(int quantity) {


		this.quantity = quantity;
		
	}

	private void setPricePerUnit(double pricePerUnit) {


		this.pricePerUnit = pricePerUnit;
		
	}
	
	// Get metodene
	
	public String getName()		{
		
		return name;
	}
	
	public int getQuantity()	{
		
		return quantity;
	}
	
	public double getPricePerUnit()		{
		
		return pricePerUnit;
	}
	
	public double getCost()	{
		
		return quantity * pricePerUnit;
	}
	
	public String toString()	{
		
		return String.format("%-5d %-20s (%.2f, arg1) /stk", getQuantity(), getName(), getPricePerUnit());
	}
	
	
}
