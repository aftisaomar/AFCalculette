package aftis.calculatrice.tuto;

public class CalculModel {
	
	// Definition des methodes
	
	
	public int addition (int a , int b) {
		
		return a+b;
		
	}
	
	
	public int soustraction(int a, int b)
	{
		
		return a-b;
		
	}
	
	
	public int  multiplication(int a, int b) {
		
		
		return a*b;
		
	}
	
	
	
	public int division ( int a , int b) {
		
		return a/b;
		
	}
	
	

	
	
	public static void main(String[] args) {
		
		
		CalculModel model = new CalculModel();
		
		CalculView view = new CalculView ("AFTIS CALCULETTE",model);
		
	}
	
	
	
	

}
